class Solution {
    public int combinationSum4(int[] nums, int target) {  
        return  findcombination(0,nums, target);
    }
    private int findcombination(int index,int[] nums, int target){

     
            if(target == 0){
                return 1;
            }
            if(target < 0 || index==nums.length){
                return 0;
            }
         
        int  take_idx =  findcombination(0,nums, target-nums[index]);

        int  reject_idx =  findcombination(index+1,nums, target);
        
        
        return take_idx+reject_idx;
    }
}
        