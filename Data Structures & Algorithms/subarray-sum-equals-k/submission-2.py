class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixlist=[0] * len(nums)
        count=0
        
        prefixlist[0] = nums[0]
        for i in range(1,len(nums)):
            prefixlist[i]=prefixlist[i-1]+nums[i]

        disct={0:1}

        for num in prefixlist:

            if (num - k) in disct:
                count += disct[num - k]


            disct.update({num : disct.get(num,0)+1})       

        return count    