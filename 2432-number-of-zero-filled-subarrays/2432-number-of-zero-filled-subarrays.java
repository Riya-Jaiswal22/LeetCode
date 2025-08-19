class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i,n=nums.length;
        long res=0,x=0;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                x = x+1;
                res += x;
            }else{
                x=0;
            }
        }
        return res;
    }
}