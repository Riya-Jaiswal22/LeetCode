class Solution {
    public int maximumDifference(int[] nums) {
        int i,j,n=nums.length,res=-1;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                res = Math.max(res,nums[j]-nums[i]);
            }
        }
        if(res==0) return -1;
        return res;
    }
}