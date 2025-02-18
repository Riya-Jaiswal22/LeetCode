class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,i=0,j=n-1;
        ArrayList<Integer> arr = new ArrayList<>(); 
        while(i<j){
            arr.add(nums[i]+nums[j]);
            i++;
            j--;
        }
        return Collections.max(arr);
    }
}