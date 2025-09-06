class Solution {
    public int[] finalPrices(int[] prices) {
        int i,j,n=prices.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}