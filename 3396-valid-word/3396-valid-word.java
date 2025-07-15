class Solution {
    public boolean isValid(String word) {
        int i=0,digit=0,vowel=0,consonent=0;
        char ch;
        while(i<word.length()){
            ch = word.charAt(i);
            if(ch=='@' || ch=='#' || ch=='$'){
                return false;
            }else if(Character.isDigit(ch)){
                digit++;
            }else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel++;
            }else{
                consonent++;
            }
            i++;
        }
        if(vowel>0 && consonent>0 && digit+vowel+consonent>=3){
            return true;
        }else{
            return false;
        }
    }
}