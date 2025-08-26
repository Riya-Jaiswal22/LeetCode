class Solution {
    public int[] getConcatenation(int[] nums) {
        int i,len=nums.length;
        int[] res = new int[2*len];
        for(i=0;i<len;i++){
            res[i] = nums[i];
            res[i+len] = nums[i];
        }
        return res;
    }
}