class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1,n=nums.length,t;
        while(i<j && j<n){
            if(nums[i]%2!=0 && nums[j]%2==0){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }
            else if(nums[i]%2!=0 && nums[j]%2!=0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return nums;
    }
}