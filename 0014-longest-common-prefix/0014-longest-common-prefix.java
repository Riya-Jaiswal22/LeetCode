class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int i,j=0;
        String res="";
        char t;
        boolean flag = true;
        while(flag){
            if (j >= strs[0].length()) break;
            t = strs[0].charAt(j);
            for(i=0;i<strs.length;i++){
                if(j >= strs[i].length() || strs[i].charAt(j)!=t){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                res = res + strs[0].charAt(j);
                j++;
            }
        }
        return res;
    }
}