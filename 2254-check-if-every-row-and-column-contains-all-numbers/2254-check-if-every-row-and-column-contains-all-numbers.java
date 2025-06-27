class Solution {
    public boolean checkValid(int[][] matrix) {
        int i,j,n=matrix.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                map.put(matrix[i][j],map.getOrDefault(matrix[i][j],0)+1);
            }
            if(map.size()!=n) return false;
            map.clear();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                map.put(matrix[j][i],map.getOrDefault(matrix[j][i],0)+1);
            }
            if(map.size()!=n) return false;
            map.clear();
        }
        return true;
    }
}