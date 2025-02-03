class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int res,n=nums.length;
        int score=nums[n-1]-nums[0];
        res = score;
        for(int i=0;i<n-1;i++){
            int ma = Math.max(nums[i]+k,nums[n-1]-k);
            int mi = Math.min(nums[0]+k,nums[i+1]-k);
            score = ma-mi;
            res = Math.min(res,score);
        }
        return res;
    }
}