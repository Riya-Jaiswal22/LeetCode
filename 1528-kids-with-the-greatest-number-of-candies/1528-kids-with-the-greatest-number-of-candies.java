class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,m=0,n=candies.length;
        for(i=0;i<n;i++){
            if(m<candies[i]){
                m = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(i=0;i<n;i++){
            if(candies[i]+extraCandies >= m){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}