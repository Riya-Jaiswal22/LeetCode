class Solution {
    public int countPairs(int[] nums, int k) {
        int i,j,n=nums.length,res=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    res++;
                }
            }
        }
        return res;
    }
}