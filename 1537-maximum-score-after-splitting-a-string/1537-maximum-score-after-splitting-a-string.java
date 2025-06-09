class Solution {
    public int maxScore(String s) {
        int i=0,res=0,j,zero,one,n=s.length();
        String left,right;
        while(i<n-1){
            left = s.substring(0,i+1);
            right = s.substring(i+1);
            j=0;
            zero = 0;
            one = 0;
            while(j<i+1){
                if(s.charAt(j)=='0') zero++;
                j++;
            }
            while(j<n){
                if(s.charAt(j)=='1') one++;
                j++;
            }
            res = Math.max(res,zero+one);
            i++;
        }
        return res;
    }
}