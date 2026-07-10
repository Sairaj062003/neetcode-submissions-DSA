class Solution {
     private int[][] dp;

    public boolean stoneGame(int[] piles) {
        
        int total = 0; 
        for(int i = 0 ; i<piles.length ; i++){
            total+=piles[i];
        }
        int n = piles.length;
         dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int alicescore = dfs(0, piles.length-1,piles);
        return alicescore > total-alicescore ;
    }

    private int dfs(int l ,int r ,int[]  piles ){
      
      if(l>r) return 0;

      if(dp[l][r]  != -1){
        return dp[l][r];
      }

      boolean even = (r-l)%2 ==0;
      int left = even ? piles[l] :0;
      int right = even ? piles[r]:0;

      dp[l][r] = Math.max(piles[l]+dfs(l+1 ,r, piles) , piles[r]+dfs(l,r-1,piles));
      return dp[l][r] ;

    }
}