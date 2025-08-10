class Solution {
    public int[] freqDigit(int n){
        int[] freq = new int[10];
        while(n>0){
            freq[n%10]++;
            n /= 10;
        }
        return freq;
    }
    public boolean equal(int[] a,int[] b){
        for(int i=0;i<10;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public boolean reorderedPowerOf2(int n) {
        int[] num = freqDigit(n);
        int i,x;
        for(i=0;i<=29;i++){
            x = (int)Math.pow(2,i);
            int[] a = freqDigit(x);
            if(equal(num,a)) return true;
        }
        return false;
    }
}