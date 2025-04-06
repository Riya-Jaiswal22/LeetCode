class Solution {
    public boolean rotateString(String s, String goal) {
        int n1=s.length(),n2=goal.length();
        if(n1!=n2){
            return false;
        }
        String t = s+s;
        return t.contains(goal);
    }
}