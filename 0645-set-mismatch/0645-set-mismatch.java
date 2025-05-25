class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int i,sum=0,esum,n=nums.length;
        esum = n*(n+1)/2;
        int[] res = new int[2];
        for(i=0;i<n;i++){
            sum += nums[i];
            if(i!=0 && nums[i]==nums[i-1]){
                res[0] = nums[i];
            }
        }
        res[1] = esum-sum+res[0];
        return res;
    }
}