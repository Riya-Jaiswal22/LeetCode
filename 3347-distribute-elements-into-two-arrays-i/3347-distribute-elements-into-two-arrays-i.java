class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int j=1,k=1;
        for(int i=2;i<nums.length;i++){
            if(arr1.get(j-1)>arr2.get(k-1)){
                arr1.add(nums[i]);
                j++;
            }else{
                arr2.add(nums[i]);
                k++;
            }
        }
        arr1.addAll(arr2);
        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}