class Solution {
    public int maxProduct(int[] nums) {
        int rightproduct= 1 , leftproduct=1 ; 
        int ans = nums[0];

        for(int i =0 ; i<nums.length ; i++){

            leftproduct = leftproduct==0 ? 1:leftproduct;
            rightproduct = rightproduct==0 ? 1:rightproduct;


             leftproduct  *= nums[i];
             rightproduct  *= nums[nums.length-1-i];

            ans=Math.max(ans,Math.max(rightproduct , leftproduct )) ;
        }

        return ans;
        
    }
}
