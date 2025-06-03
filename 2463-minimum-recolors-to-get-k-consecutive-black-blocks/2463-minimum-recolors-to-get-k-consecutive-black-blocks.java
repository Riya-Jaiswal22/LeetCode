class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = Integer.MAX_VALUE,i=0,j,c,n=blocks.length();
        while(i<n){
            j = i;
            c=0;
            while(j<n && j<i+k){
                if(blocks.charAt(j)=='B'){
                    c++;
                }
                j++;
            }
            res = Math.min(res,k-c);
            i++;
        }
        return res;
    }
}