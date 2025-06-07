class Solution {
    public int balancedStringSplit(String s) {
        int i=0,count=0,balance,j;
        while(i<s.length()){
            if(s.charAt(i)=='R') balance=1;
            else balance = -1;
            j = i+1;
            while(j<s.length() && balance!=0){
                if(s.charAt(j)=='R') balance+=1;
                else balance-=1;
                j++;
            }
            count++;
            i = j;
        }
        return count;
    }
}