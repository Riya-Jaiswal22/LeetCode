class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        StringBuilder res = new StringBuilder();
        ArrayList<ArrayList<Character>> groups = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            ArrayList<Character> groupA = null, groupB = null;
            for (ArrayList<Character> group : groups) {
                if (group.contains(a)) groupA = group;
                if (group.contains(b)) groupB = group;
            }
            if (groupA == null && groupB == null) {
                ArrayList<Character> newGroup = new ArrayList<>();
                newGroup.add(a);
                newGroup.add(b);
                groups.add(newGroup);
            } else if (groupA != null && groupB == null) {
                groupA.add(b);
            } else if (groupA == null && groupB != null) {
                groupB.add(a);
            } else if (groupA != groupB) {
                groupA.addAll(groupB);
                groups.remove(groupB);
            }
        }
        for (ArrayList<Character> group : groups) {
            Collections.sort(group);
        }
        groups.sort(Comparator.comparing(g -> g.get(0)));
        Map<Character, Character> map = new HashMap<>();
        for (ArrayList<Character> group : groups) {
            char smallest = group.get(0);
            for (char ch : group) {
                map.put(ch, smallest);
            }
        }
        for (int i = 0; i < baseStr.length(); i++) {
            char ch = baseStr.charAt(i);
            res.append(map.getOrDefault(ch, ch));
        }
        return res.toString();
    }
}
