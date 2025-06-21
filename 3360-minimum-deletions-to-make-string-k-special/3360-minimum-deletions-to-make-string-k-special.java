class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Integer> freqList = new ArrayList<>(freq.values());
        Collections.sort(freqList);

        int n = freqList.size();
        int minDeletions = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int base = freqList.get(i);
            int deletions = 0;
            for (int j = 0; j < i; j++) {
                deletions += freqList.get(j);
            }
            for (int j = i + 1; j < n; j++) {
                if (freqList.get(j) > base + k) {
                    deletions += freqList.get(j) - (base + k);
                }
            }

            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}