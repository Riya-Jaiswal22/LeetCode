class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0,j=0,n=mat.length,res=0;
        while(i<n && j<n){
            res += mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n && j>=0){
            if(i==n/2 && j==n/2){
                i++;
                j--;
                continue;
            } 
            res += mat[i][j];
            i++;
            j--;
        }
        return res;
    }
}