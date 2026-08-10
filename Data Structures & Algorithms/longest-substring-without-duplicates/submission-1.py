class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        Char_set =set()
        maxlen = 0
        left = 0
        for i in range (len(s)):

            while s[i] in Char_set:
                Char_set.remove(s[left])
                left+=1

            Char_set.add(s[i])
            maxlen=max(maxlen,i-left+1)

        return maxlen
                

        