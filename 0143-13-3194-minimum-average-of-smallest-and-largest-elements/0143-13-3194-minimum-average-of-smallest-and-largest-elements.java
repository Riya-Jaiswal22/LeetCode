class Solution {
    public double minimumAverage(int[] nums) {
        double res=Double.MAX_VALUE,avg;
        Arrays.sort(nums);
        int i=0,n=nums.length;
        while(i<n/2){
            avg = ((nums[i]+nums[nums.length-1-i])/2.0);
            res = Math.min(avg,res);
            i++;
        }
        return res;
    }
}