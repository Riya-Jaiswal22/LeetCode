class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder(s);
        int i=0,n=s.length();
        if(n<k) return res.reverse().toString();
        while(i<n){
            if(i+k<n){
                String x = res.substring(i,i+k);
                StringBuilder sb = new StringBuilder(x).reverse();
                res.replace(i,i+k,sb.toString());
            }else{
                String x = res.substring(i);
                StringBuilder sb = new StringBuilder(x).reverse();
                res.replace(i,n,sb.toString());
            }
            i += 2*k;
        }
        return res.toString();
    }
}