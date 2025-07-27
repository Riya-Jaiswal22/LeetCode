class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int prev = nums[0],i=1,res=0;
        arr.add(nums[0]);
        while(i<nums.length){
            if(nums[i]!=prev){
                prev = nums[i];
                arr.add(nums[i]);
            }
            i++;
        }
        for(i=1;i<arr.size()-1;i++){
            if((arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)) || (arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1))){
                res++;
            }
        }
        return res;
    }
}