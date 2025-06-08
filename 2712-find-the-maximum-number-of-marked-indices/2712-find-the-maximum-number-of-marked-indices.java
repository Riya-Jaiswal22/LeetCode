class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n=nums.length,i=0,j=n/2,res=0;
        Arrays.sort(nums);
        while(i<n/2 && j<n){
            if(nums[j]>=2*nums[i]){
                i++;
                res+=2;
            }
            j++;
        }
        return res;
    }
}