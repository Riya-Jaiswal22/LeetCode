class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortWord = new String(chars);
            if(!res.containsKey(sortWord)){
                res.put(sortWord,new ArrayList<>());
            }
            res.get(sortWord).add(word);
        }
        return new ArrayList<>(res.values());
    }
}