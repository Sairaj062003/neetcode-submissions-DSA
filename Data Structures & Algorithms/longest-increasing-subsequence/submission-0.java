class Solution {
     int[] result;
    public int lengthOfLIS(int[] nums) {
        int ans = 1 ;
         result = new int[nums.length];

         Arrays.fill(result,-1);

         for(int i = 0 ; i< nums.length ; i++){
            ans=Math.max(ans,solve(nums,i));
         }
      
      return ans;
    }

    private int solve(int[] nums , int i){

        if(result[i] !=-1){
            return result[i];
        }
        int LTS = 1;
        for(int j = i+1 ; j<nums.length ; j++){
        if(nums[j]>nums[i]){
          LTS=Math.max(LTS, 1+solve(nums,j));
        }
        }
        result[i]=LTS;

        return LTS;
    }
}
