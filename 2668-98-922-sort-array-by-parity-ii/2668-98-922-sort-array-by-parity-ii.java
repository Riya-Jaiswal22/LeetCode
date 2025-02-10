class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int i=0,j=1,n=nums.length;
        for(int num : nums){
            if(num%2==0){
                res[i] = num;
                i += 2;
            }else{
                res[j] = num;
                j += 2;
            }
        }
        return res;
    }
}