class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        int i=0;
        Collections.addAll(set,'A','E','I','O','U','a','e','i','o','u');
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                vowel.add(ch);
            }
        }
        Collections.sort(vowel);
        StringBuilder result = new StringBuilder();
        for(char ch:s.toCharArray()){
            if (set.contains(ch)) {
                result.append(vowel.get(i++));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}