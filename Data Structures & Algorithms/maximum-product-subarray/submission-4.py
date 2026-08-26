class Solution:
    def maxProduct(self, nums: List[int]) -> int:
         leftproduct , rightproduct =1,1
         ans=nums[0]

         for i in range (len(nums)):
            leftproduct = 1 if  leftproduct==0 else  leftproduct
            rightproduct= 1 if  rightproduct==0 else rightproduct 

            leftproduct *=nums[i]
            rightproduct *= nums[len(nums)-1-i]

            ans = max(ans, max(leftproduct, rightproduct))

         return ans
        