class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res = new int[2];
        int i,j,n=nums.length,min=0,max=0;
        for(i=0,j=indexDifference;j<n;i++,j++){
            if(nums[min] > nums[i]){
                min = i;                
            }    
            else if(nums[max] < nums[i]){
                max = i;
            }
            if(Math.abs(nums[min]-nums[j]) >= valueDifference){
                res[0] = min;
                res[1] = j;
                return res;
            }  
            if(Math.abs(nums[max]-nums[j]) >= valueDifference){
                res[0] = max;
                res[1] = j;
                return res; 
            } 
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}