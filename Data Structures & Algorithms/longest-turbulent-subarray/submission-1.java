class Solution {
    public int maxTurbulenceSize(int[] arr) {
        char prev = ' ';
        int i =1 ,  ans =1 ,  left =0;

        while(i<arr.length){

            if( arr[i-1]>arr[i]){
                
                if(prev == '>'){
                    left =i-1;
                    }
              
                prev='>';

            }
            else if(  arr[i-1]<arr[i]){                   
                
                if(prev == '<'){
                    left =i-1;
                    }
            
                
                prev='<';
            }
            else{
                left =i;
                prev=' ';
            }
              ans=Math.max(ans, i-left+1);

            i++;
        }


        return ans;
    }
}