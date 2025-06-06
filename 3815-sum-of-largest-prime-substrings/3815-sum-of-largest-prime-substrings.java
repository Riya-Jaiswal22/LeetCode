class Solution {
    public boolean isPrime(long n){
        if(n<2) return false;
        for(long i=2; i*i<=n; i++){
            if(n%i==0) return false;
        } 
        return true;
    }
    public long sumOfLargestPrimes(String s) {
        long res=0,n;
        int i,j,len;
        Set<Long> prime = new HashSet<>();
        for(i=0;i<s.length();i++){
            long temp = 0;
            for(j=i;j<s.length();j++){
                temp = temp * 10 + (s.charAt(j) - '0');
                if (isPrime(temp)) {
                    prime.add(temp);
                }
            }
        }
        ArrayList<Long> sortedPrime = new ArrayList<>(prime);
        Collections.sort(sortedPrime, Collections.reverseOrder());
        for (i = 0; i < Math.min(3, sortedPrime.size()); i++) {
           res += sortedPrime.get(i);
        }
        return res;
    }
}