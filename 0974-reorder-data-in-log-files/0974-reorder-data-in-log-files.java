class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        for (String log : logs) {
            int idx = log.indexOf(' ');
            if (Character.isDigit(log.charAt(idx + 1))) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }
        Collections.sort(letters, (log1, log2) -> {
            int idx1 = log1.indexOf(' ');
            int idx2 = log2.indexOf(' ');
            String id1 = log1.substring(0, idx1);
            String id2 = log2.substring(0, idx2);
            String content1 = log1.substring(idx1 + 1);
            String content2 = log2.substring(idx2 + 1);
            
            int cmp = content1.compareTo(content2);
            if (cmp == 0) {
                return id1.compareTo(id2);
            }
            return cmp;
        });
        List<String> result = new ArrayList<>();
        result.addAll(letters);
        result.addAll(digits);
        return result.toArray(new String[0]);
    }
}
