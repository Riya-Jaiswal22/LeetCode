class Solution {
    public int sumOfBeauties(int[] nums) {
        int i,n=nums.length,beauty=0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(i=1;i<n;i++){
            prefix[i] = Math.max(nums[i],prefix[i-1]);
        }
        for(i=n-2;i>=0;i--){
            suffix[i] = Math.min(nums[i],suffix[i+1]);
        }
        for(i=1;i<n-1;i++){
            if(nums[i]>prefix[i-1] && nums[i]<suffix[i+1]) beauty += 2;
            else{
                if(nums[i-1]<nums[i] && nums[i]<nums[i+1]){
                    beauty += 1;
                }
            }
        }
        return beauty;
    }
}