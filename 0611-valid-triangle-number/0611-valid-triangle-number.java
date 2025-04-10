class Solution {
    public int triangleNumber(int[] nums) {
        int i,j,k,n=nums.length,res=0;
        Arrays.sort(nums);
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                    if(nums[k]<nums[i]+nums[j]){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}