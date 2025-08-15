class Solution {
    public int findClosestNumber(int[] nums) {
        int diff=Integer.MAX_VALUE,res=0;
        for(int x:nums){
            if(Math.abs(0-x)<diff){
                res = x;
                diff = Math.abs(0-x);
            }else if(Math.abs(0-x)==diff){
                res = Math.max(res,x);
            }
        }
        return res;
    }
}