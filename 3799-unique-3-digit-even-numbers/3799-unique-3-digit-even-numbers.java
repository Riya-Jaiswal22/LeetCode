class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int t,digit,count,res = 0;
        boolean flag;
        for(int i : digits){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i=100;i<999;i++){
            if(i%2 != 0){
                continue;
            }
            HashMap<Integer,Integer> temp = new HashMap<>();
            String s = String.valueOf(i);
            for(int j=0; j<s.length(); j++){
                t = s.charAt(j) - '0';
                temp.put(t, temp.getOrDefault(t,0)+1);
            }
            flag = true;
            for(Map.Entry<Integer,Integer> entry: temp.entrySet()){
                digit = entry.getKey();
                count = entry.getValue();
                if(map.getOrDefault(digit,0)<count){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                res++;
            }
        }
        return res;
    }
}