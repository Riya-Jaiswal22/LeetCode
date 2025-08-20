class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int i,j,res=0;
        int[][] dp = new int[n][m];
        for(i=0;i<n;i++){
            dp[i][0] = matrix[i][0];
            res += matrix[i][0];
        }
        for(i=1;i<m;i++){
            dp[0][i] = matrix[0][i];
            res += matrix[0][i];
        }
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(matrix[i][j]==1){
                    dp[i][j] = 1+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
                res += dp[i][j];
            }
        }
        return res;
    }
}