class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,res=0;
        boolean flag = false;
        while(i<=j && j<nums.length){
            if(nums[j]==0 && !flag){
                j++;
                flag = true;
            }else if(nums[j]==1){
                j++;
            }else{
                if(nums[i]==0){
                    i++;
                    flag = false;
                }else{
                    res = Math.max(res,j-i-1);
                    i++;
                }
            }
        }
        res = Math.max(res,j-i-1);
        return res;
    }
}