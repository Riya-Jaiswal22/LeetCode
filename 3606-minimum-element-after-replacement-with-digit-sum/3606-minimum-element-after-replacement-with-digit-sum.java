class Solution {
    public int sumDigit(int num){
        int sum=0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int i;
        for(i=0;i<nums.length;i++){
            nums[i] = sumDigit(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
}