class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i,res=Integer.MAX_VALUE;
        for(i=0;i<cards.length;i++){
            if(hm.containsKey(cards[i])){
                int start = hm.get(cards[i]);
                res = Math.min(res,i-start+1);
            }
            hm.put(cards[i],i);
        }
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
}