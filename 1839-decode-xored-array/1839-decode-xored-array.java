class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length,i;
        int[] res = new int[n+1];
        res[0] = first;
        for(i=0;i<n;i++){
            res[i+1] = res[i]^encoded[i];
        }
        return res;
    }
}