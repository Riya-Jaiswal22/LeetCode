class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0,c;
        while(i<s.length()){
            if(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                char ch = s.charAt(i);
                c = 0;
                while(i<s.length() && s.charAt(i)==ch){
                    i++;
                    c++;
                }
                if(c>=2){
                    sb.append(ch);
                    sb.append(ch);
                }
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}