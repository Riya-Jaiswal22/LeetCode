class Solution {
    public boolean isPalindrome(String a,int s,int e){
        while(s<e){
            if(a.charAt(s)!=a.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int i,j,n=s.length();
        String res="",t;
        if(n==1){
            return s;
        }
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(res.length()<j-i+1){
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}