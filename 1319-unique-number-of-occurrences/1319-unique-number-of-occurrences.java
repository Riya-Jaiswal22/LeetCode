class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,c,t;
        while(i<arr.length){
            t = arr[i];
            c = 0;
            while(i<arr.length && arr[i]==t){
                c++;
                i++;
            }
            if(li.contains(c)){
                return false;
            }else{
                li.add(c);
            }
        }
        return true;
    }
}