class Solution {
    public float distance(int[] p1, int[] p2){
        return (float)Math.sqrt(Math.pow((p1[0]-p2[0]),2) + Math.pow((p1[1]-p2[1]),2));
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if(Arrays.equals(p1,p2) || Arrays.equals(p2,p3) || Arrays.equals(p3,p4) || Arrays.equals(p1,p3) || Arrays.equals(p1,p4) || Arrays.equals(p4,p2)){
            return false;
        }
        float[] dist = new float[6];
        dist[0] = distance(p1,p2);
        dist[1] = distance(p2,p3);
        dist[2] = distance(p3,p4);
        dist[3] = distance(p1,p3);
        dist[4] = distance(p1,p4);
        dist[5] = distance(p2,p4);
        Arrays.sort(dist);
        if(dist[0]==dist[1] && dist[1]==dist[2] && dist[2]==dist[3] && dist[4]==dist[5]){
            return true;
        }
        else{
            return false;
        }
    }
}