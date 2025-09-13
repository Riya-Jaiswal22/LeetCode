class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cons=0,vowel=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char ch = entry.getKey();
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel = Math.max(vowel,entry.getValue());
            }else{
                cons = Math.max(cons,entry.getValue());
            }
        }
        return vowel+cons;
    }
}