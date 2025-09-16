class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        int i,j,n=rectangles.length;
        long res=0;
        HashMap<Double,Integer> map = new HashMap<>();
        for(i=0;i<n;i++){
            double ratio = (double)rectangles[i][0]/rectangles[i][1];
            map.put(ratio,map.getOrDefault(ratio,0)+1);
        }
        for(Map.Entry<Double,Integer> entry: map.entrySet()){
            int val = entry.getValue();
            if(val>1){
                res += (long) val * (val-1)/2;
            }
        }
        return res;
    }
}