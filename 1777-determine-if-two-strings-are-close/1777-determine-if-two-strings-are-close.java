class Solution {
    public boolean closeStrings(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length(),i;
        if(l1!=l2){
            return false;
        }
        Set<Character> c1 = new HashSet<>();
        Set<Character> c2 = new HashSet<>();
        for (char ch : word1.toCharArray()) {
            c1.add(ch);
        }
        for (char ch : word2.toCharArray()) {
            c2.add(ch);
        }
        if (!c1.equals(c2)) { 
            return false;
        }
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        li1 = occurance(word1);
        li2 = occurance(word2);
        Collections.sort(li1);
        Collections.sort(li2);
        return li1.equals(li2);
    }
    public ArrayList<Integer> occurance(String s){
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        String s1 = String.valueOf(ar);
        ArrayList<Integer> li = new ArrayList<>();
        int i=0,c=0;
        char t;
        while(i<s1.length()){
            t = s1.charAt(i);
            c = 0;
            while(i<s1.length() && s1.charAt(i)==t){
                i++;
                c++;
            }
            li.add(c);
        }
        return li;
    }
}