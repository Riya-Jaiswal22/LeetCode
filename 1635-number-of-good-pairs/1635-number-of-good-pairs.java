class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j,res=0,n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    res++;
                }
            }
        }
        return res;
    }
}