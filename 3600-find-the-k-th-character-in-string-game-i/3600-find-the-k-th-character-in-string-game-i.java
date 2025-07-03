class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        int i,n;
        while(sb.length()<k){
            i = 0;
            n = sb.length();
            while(i<n){
                if(sb.charAt(i)=='z'){
                    sb.append("a");
                }else{
                    sb.append((char)((int)sb.charAt(i)+1)); 
                }
                i++;
            }
        }
        return sb.charAt(k-1);
    }
}