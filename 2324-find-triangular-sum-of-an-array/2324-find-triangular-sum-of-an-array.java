class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> oriList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int x;
        while(oriList.size() != 1){
            for(int i=0;i<oriList.size()-1;i++){
                x = (oriList.get(i) + oriList.get(i+1))%10;
                oriList.set(i,x);
            }
            oriList.remove(oriList.size()-1);
        }
        return oriList.get(0);
    }
}