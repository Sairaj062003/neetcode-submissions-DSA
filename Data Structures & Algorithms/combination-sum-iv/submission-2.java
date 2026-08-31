class Solution {
    int dp[][] ;
    public int combinationSum4(int[] nums, int target) {  
        dp = new int[201][1001];
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }
        return  findcombination(0,nums, target);
    }
    private int findcombination(int index,int[] nums, int target){

     
            if(target == 0){
                return 1;
            }
            if(target < 0 || index==nums.length){
                return 0;
            }
            if(dp[index][target] != -1){
                return dp[index][target];
            }
         
        int  take_idx =  findcombination(0,nums, target-nums[index]);

        int  reject_idx =  findcombination(index+1,nums, target);
        
        
        return dp[index][target]=take_idx+reject_idx;
    }
}
        