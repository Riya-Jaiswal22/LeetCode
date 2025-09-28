class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        } 
        int i,n=nums.length,res=0;
        Arrays.sort(nums);
        for(i=n-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                res = Math.max(res,nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        return res;
    }
}