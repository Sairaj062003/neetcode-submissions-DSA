class Solution {
    public int lastStoneWeightII(int[] stones) {
            
        int total = 0;

        for (int stone : stones) {
            total += stone;
        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

         for (int stone : stones) {

            for (int j = target; j >= stone; j--) {

                dp[j] = dp[j] || dp[j - stone];
            }
        }

        for (int i = target; i >= 0; i--) {

            if (dp[i]) {

                return total - 2 * i;
            }
        }

        return 0;
    }
}

    