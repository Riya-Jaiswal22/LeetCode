class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
        }
        if(c==0) return false;
        return true;
    }
}