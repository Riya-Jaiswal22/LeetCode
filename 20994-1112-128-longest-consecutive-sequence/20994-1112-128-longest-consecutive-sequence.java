class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,res=1,i,n=nums.length;
        if(n==0){
            return 0;
        }
        for(i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                c++;
            }
            else if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                res = Math.max(res,c);
                c=1;
            }
        }
        res = Math.max(res,c);
        return res;
    }
}