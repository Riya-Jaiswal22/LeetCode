class Solution {
    public boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=1 && isPrime(arr.get(i))){
                return true;
            }
        }
        return false;
    }
}