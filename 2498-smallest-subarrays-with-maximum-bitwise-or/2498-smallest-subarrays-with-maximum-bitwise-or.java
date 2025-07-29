class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int i,j;
        for(i=0;i<n;i++){
            int x = nums[i];
            res[i] = 1;
            j = i-1;
            while(j>=0 && ((nums[j]|x) != nums[j])){
                res[j] = i-j+1;
                nums[j] |= x;
                j--;
            }
        }
        return res;
    }
}