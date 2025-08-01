class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i=1,j;
        res.add(new ArrayList<>(Arrays.asList(1)));
        while(i<numRows){
            j=0;
            ArrayList<Integer> t = new ArrayList<>();
            while(j<=i){
                if(j==0 || j==i){
                    t.add(1);
                }else{
                    int x = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    t.add(x);
                }
                j++;
            }
            res.add(t);
            i++;
        }
        return res;
    }
}