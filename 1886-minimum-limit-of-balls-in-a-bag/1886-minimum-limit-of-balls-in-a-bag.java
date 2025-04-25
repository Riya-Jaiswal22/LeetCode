class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt(),mid;
        while(low<high){
            mid = low + (high-low)/2;
            if(canDivide(nums,maxOperations,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean canDivide(int[] nums, int maxOperations, int maxSize){
        int ops = 0;
        for(int num : nums){
            ops += (num-1)/maxSize;
        }
        return ops<=maxOperations;
    }
}