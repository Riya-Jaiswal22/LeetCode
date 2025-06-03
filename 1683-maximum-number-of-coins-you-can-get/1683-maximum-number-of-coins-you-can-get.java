class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length,i=0,j=n-2;
        int res = 0;
        while(i<n/3){
            res += piles[j];
            i++;
            j-=2;
        }
        return res;
    }
}