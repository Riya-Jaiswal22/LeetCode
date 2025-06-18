class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length,i,j,x=0;
        int[][] res = new int[n/3][3];
        Arrays.sort(nums);
        for(i=0;i<n/3;i++){
            for(j=0;j<3 && x<n;j++){
                res[i][j] = nums[x];
                x++;
            }
            if(res[i][2]-res[i][0]>k) return new int[0][];
        }
        return res;
    }
}