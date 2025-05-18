class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length(),i,x=n,y=0;
        int[] perm = new int[n+1];
        for(i=0;i<n;i++){
            if(s.charAt(i) == 'I'){
                perm[i] = y;
                y++;
            }else{
                perm[i] = x;
                x--;
            }
        }
        perm[i] = x;
        return perm;
    }
}