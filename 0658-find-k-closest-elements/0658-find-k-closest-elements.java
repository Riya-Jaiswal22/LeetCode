class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int a:arr){
            if(res.size()<k){
                res.add(a);
            }else{
                if(Math.abs(res.get(0)-x) > Math.abs(a-x)){
                    res.remove(res.get(0));
                    res.add(a);
                }else if(Math.abs(res.get(0)-x) == Math.abs(a-x) && res.get(0)>a){
                    res.remove(res.get(0));
                    res.add(a);
                }
            }
        }
        return res;
    }
}