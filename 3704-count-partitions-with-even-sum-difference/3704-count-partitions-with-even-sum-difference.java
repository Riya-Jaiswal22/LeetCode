class Solution {
    public int countPartitions(int[] nums) {
        int lsum=nums[0],rsum=0,i,n=nums.length,res=0;
        for(i=1;i<n;i++){
            rsum += nums[i];
        }
        for(i=1;i<n;i++){
            if(Math.abs(rsum-lsum)%2==0){
                res++;
            }
            lsum += nums[i];
            rsum -= nums[i];
        }
        return res;
    }
}