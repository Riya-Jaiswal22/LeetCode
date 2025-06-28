class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        int i,j,n=nums.length,idx,min;
        for(i=0;i<k;i++){
            res[i] = nums[i];
        }
        for(i=k;i<n;i++){
            min = Integer.MAX_VALUE;
            idx=-1;
            for(j=0;j<k;j++){
                if(nums[i]>res[j] && min>res[j]){
                    min = res[j];
                    idx = j;
                }
            }
            if(idx!=-1){
                for(int x=idx;x<k-1;x++){
                    res[x] = res[x+1];
                }
                res[k-1] = nums[i];
            }
        }
        return res;
    }
}