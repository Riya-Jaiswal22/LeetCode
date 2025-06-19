class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0,n=nums.length,i=0,j;
        while(i<n){
            int[] partition = new int[n];
            j=0;
            while(j<n && i<n){
                if(j==0){
                    partition[j] = nums[i];
                }
                else{
                    if(nums[i]-partition[j-1]<=k && nums[i]-partition[0]<=k){
                        partition[j] = nums[i];
                    }
                    else{
                        break;
                    }
                }
                i++;
                j++;
            }
            res++;
        }
        return res;
    }
}