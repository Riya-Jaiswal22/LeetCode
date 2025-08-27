class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int i;
        boolean hasMax = false;
        for(i=nums.length-1;i>=0;i--){
            if(max1==Integer.MIN_VALUE){
                max1 = nums[i];
            }else if(max1!=nums[i] && max2==Integer.MIN_VALUE){
                max2 = nums[i];
            }else if(max2!=nums[i] && max1!=nums[i] && max3==Integer.MIN_VALUE){
                max3 = nums[i];
                hasMax = true;
                break;
            }
        }
        return hasMax?max3:max1;
    }
}