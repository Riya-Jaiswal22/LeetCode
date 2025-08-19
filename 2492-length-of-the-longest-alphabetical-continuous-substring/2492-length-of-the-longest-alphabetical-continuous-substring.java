class Solution {
    public int longestContinuousSubstring(String s) {
        int res=0,i=0,len,n=s.length();
        if(n==1) return 1;
        while(i<n-1){
            len = 0;
            while(i<n-1 && s.charAt(i+1)-s.charAt(i)==1){
                len++;
                i++;
            }
            i++;
            res = Math.max(res,len+1);
        }
        return res;
    }
}