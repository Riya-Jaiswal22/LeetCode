class Solution {
    public int maximumSum(int[] nums) {
        int i,n=nums.length,key,res=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<n;i++){
            key = sumOfDigits(nums[i]);
            if(!map.containsKey(key)){
                map.put(key,nums[i]);
            }else{
                res = Math.max(res,map.get(key)+nums[i]);
                map.put(key,Math.max(map.get(key),nums[i]));
            }
        }
        return res;
    }
    public int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}