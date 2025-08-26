class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int i,j,area=0;
        float diagonal=0,t;
        for(i=0;i<dimensions.length;i++){
            t = (float)Math.sqrt(Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2));
            if(diagonal<t){
                diagonal = t;
                area = dimensions[i][0]*dimensions[i][1];
            }else if(diagonal==t){
                area = Math.max(area,dimensions[i][0]*dimensions[i][1]);
            }
        }
        return area;
    }
}