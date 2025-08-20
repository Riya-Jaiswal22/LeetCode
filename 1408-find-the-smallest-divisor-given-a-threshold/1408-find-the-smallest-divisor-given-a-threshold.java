class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=getMax(nums),mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(remSum(nums,mid)<=threshold){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public int getMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max = Math.max(max,num);
        }
        return max;
    }
    public int remSum(int[] nums,int divisor){
        int sum = 0;
        for(int num:nums){
            sum += Math.ceil((double)(num)/(double)(divisor));
        }
        return sum;
    }
}