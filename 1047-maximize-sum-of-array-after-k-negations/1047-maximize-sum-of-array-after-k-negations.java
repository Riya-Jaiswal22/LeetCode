class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int i,min,idx,n=nums.length,sum=0;
        while(k>0){
            min = Integer.MAX_VALUE;
            idx = -1;
            for(i=0;i<n;i++){
                if(nums[i]<min){
                    min = nums[i];
                    idx = i;
                }
            }
            nums[idx] = -1*nums[idx];
            k--;
        }
        for(i=0;i<n;i++){
            sum += nums[i];
        }
        return sum;
    }
}