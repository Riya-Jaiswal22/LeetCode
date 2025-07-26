class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0,min=Integer.MIN_VALUE;
        Set<Integer> s = new HashSet<>();
        boolean pos=false;
        for(int x : nums){
            if(x>0){
                pos = true;
                break;
            }
            min = Math.max(min,x);
        }
        if(pos==false) return min;
        for(int x : nums){
            if(!s.contains(x) && x>0){
                sum += x;
                s.add(x);
            }
        }
        return sum;
    }
}