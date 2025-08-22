class Solution {
    public int minimumArea(int[][] grid) {
        int rstart=-1,rend=-1,cstart=-1,cend=-1,i,j;
        int n=grid.length,m=grid[0].length;
        boolean flag;
        for(i=0;i<n;i++){
            flag = false;
            for(j=0;j<m;j++){
                if(grid[i][j]==1){
                    flag=true;
                    break;
                }
            }
            if(flag){
                rend=i+1;
                if(rstart==-1) rstart = i+1;
            } 
        }
        for(j=0;j<m;j++){
            flag = false;
            for(i=0;i<n;i++){
                if(grid[i][j]==1){
                    flag=true;
                    break;
                }
            }
            if(flag){
                cend=j+1;
                if(cstart==-1) cstart = j+1;
            } 
        }
        return (rend-rstart+1)*(cend-cstart+1);
    }
}