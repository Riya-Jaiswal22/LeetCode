class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int res=1,c;
        long x;
        while(res<=60){
            x = (long)num1 - (long)res*num2;
            if(x<0){
                res++;
                continue;
            }
            c = Long.bitCount(x);
            if(c<=res && res<=x){
                return res;
            }
            res++;
        }
        return -1;
    }
}