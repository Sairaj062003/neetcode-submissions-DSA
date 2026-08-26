class Solution {
    public int maxProduct(int[] nums) {
        int product= 1; 
        int ans = nums[0];

        for(int i =0 ; i<nums.length ; i++){

            product = product==0 ? 1:product;

            product *= nums[i];

            ans=Math.max(ans,product) ;
        }

        return ans;
        
    }
}
