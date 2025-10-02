class Solution {
    public boolean isPrime(int n){
        if(n==2 || n==3) return true;
        if(n<=1 || n%2==0 || n%3==0) return false;
        for(int i=5;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int i,j,n=nums.length;
        for(i=0;i<n;i++){
            if(isPrime(nums[i])){
                break;
            }
        }
        for(j=n-1;j>=0;j--){
            if(isPrime(nums[j])){
                break;
            }
        }
        return Math.abs(j-i);
    }
}