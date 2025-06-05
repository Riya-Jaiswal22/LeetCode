class Solution {
    public List<Integer> partitionLabels(String s) {
        int i=0,j,n=s.length();
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n){
            int lastidx = s.lastIndexOf(s.charAt(i));
            j=i+1;
            while(j<n && j<=lastidx){
                if(s.lastIndexOf(s.charAt(j))>lastidx){
                    lastidx = s.lastIndexOf(s.charAt(j));
                }
                j++;
            }
            res.add(lastidx-i+1);
            i = lastidx+1;
        }
        return res;
    }
}