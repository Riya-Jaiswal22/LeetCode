class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int m=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>m){
                m = nums[i+1]-nums[i];
            }
        }
        return m;
    }
}