class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> notLost = new ArrayList<>();
        List<Integer> Lost = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<matches.length;i++){
            map.putIfAbsent(matches[i][0],0);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry ele = (Map.Entry)itr.next();
            int val = ((int)ele.getValue());
            if(val==0){
                notLost.add((int)ele.getKey());
            }
            else if(val==1){
                Lost.add((int)ele.getKey());
            }
        }
        Collections.sort(notLost);
        Collections.sort(Lost);
        return Arrays.asList(notLost, Lost);
    }
}