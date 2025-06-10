class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> freq = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int odd=Integer.MIN_VALUE,even=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> map : freq.entrySet()){
            if(map.getValue()%2 == 0){
                even = Math.min(even,map.getValue());
            }else{
                odd = Math.max(odd,map.getValue());
            }
        }
        return odd-even;
    }
}