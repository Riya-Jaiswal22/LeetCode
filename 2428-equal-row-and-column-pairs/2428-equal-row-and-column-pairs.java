class Solution {
    public int equalPairs(int[][] grid) {
        int i,j,n=grid[0].length,c=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(match(grid,i,j,n)){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean match(int[][] grid,int r,int c,int n){
        int i=0;
        while(i<n){
            if(grid[r][i]!=grid[i][c]){
                return false;
            }
            i++;
        }
        return true;
    }
}