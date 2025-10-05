class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int i,diff=Integer.MAX_VALUE,n=arr.length;
        for(i=0;i<n-1;i++){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }
        for(i=0;i<n-1;i++){
            if(arr[i+1]-arr[i] == diff){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                res.add(temp);
            }
        }
        return res;
    }
}