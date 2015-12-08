public class Solution {
    public int numSquares(int n) {
        int b = (int) Math.sqrt(n);
       // System.out.println(b);
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <=n; i++)
            dp[i] = Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= b; j++){
                if(i+j*j <=n)
                    dp[i + j*j] = Math.min(dp[i+j*j], dp[i]+1);
            }
        }
        
        return dp[n];
    }
}