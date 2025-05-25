class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        int prev = 0;
        for(int i=0;i<n+1;i++){
            res[i] = res[i/2] + i%2;
        }
        return res;
    }
}