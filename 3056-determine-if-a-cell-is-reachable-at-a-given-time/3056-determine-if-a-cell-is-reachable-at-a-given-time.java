class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int distx = Math.abs(sx-fx);
        int disty = Math.abs(sy-fy);
        if(distx==0 && disty==0) return t!=1;
        return distx<=t && disty<=t;
    }
}