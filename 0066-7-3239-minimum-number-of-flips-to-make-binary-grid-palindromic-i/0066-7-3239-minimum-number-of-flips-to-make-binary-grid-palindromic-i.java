class Solution {
    public int minFlips(int[][] grid) {
        int row = grid.length, col = grid[0].length,i,j,count1=0,count2=0;
        for(i=0;i<row;i++){
            for(j=0;j<col/2;j++){
                if((grid[i][j]==1 && grid[i][col-1-j]==0) || (grid[i][j]==0 && grid[i][col-1-j]==1)){
                    count1++;
                }
            }
        }
        for(i=0;i<col;i++){
            for(j=0;j<row/2;j++){
                if((grid[j][i]==1 && grid[row-j-1][i]==0) || (grid[j][i]==0 && grid[row-j-1][i]==1)){
                    count2++;
                }
            }
        }
        return Math.min(count1,count2);
    }
}