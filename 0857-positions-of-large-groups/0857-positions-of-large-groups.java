class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start=0,end=0,i;
        for(i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                if(end-start+1>=3){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    res.add(temp);
                }
                start = i;
                end = i;
            }else{
                end++;
            }
        }
        if (end - start + 1 >= 3) {
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            res.add(temp);
        }
        return res;
    }
}