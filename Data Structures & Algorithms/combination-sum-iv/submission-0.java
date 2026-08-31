class Solution {
    public int combinationSum4(int[] nums, int target) {
       
       
        return  findcombination(nums, target);
    }
    private int findcombination(int[] nums, int target){

     
            if(target == 0){
                return 1;
            }
           
        
        int count = 0;
        for(int num :nums){
         if(num <=target){
           count += findcombination(nums,target-num);
         }
          
        }
        
        return count;
    }
}
        