class Solution {
    public int flip(int num){
        if(num==0) return 1;
        return 0;
    }
    public int minOperations(int[] nums) {
        int i,res=0,n=nums.length;
        for(i=0;i<n-2;i++){
            if(nums[i]==0){
                nums[i] = flip(nums[i]);
                nums[i+1] = flip(nums[i+1]);
                nums[i+2] = flip(nums[i+2]);
                res++;
            }
        }
        if(nums[n-2]==0 || nums[n-1]==0) return -1;
        return res;
    }
}