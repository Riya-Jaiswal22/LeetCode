class Solution {
    public int matrixSum(int[][] nums) {
        int i,j,res=0,rowMax;
        for(i=0;i<nums.length;i++) Arrays.sort(nums[i]);
        for(i=0;i<nums[0].length;i++){
            rowMax = 0;
            for(j=0;j<nums.length;j++){
                rowMax = Math.max(rowMax,nums[j][i]);
            }
            res += rowMax;
        }
        return res;
    }
}