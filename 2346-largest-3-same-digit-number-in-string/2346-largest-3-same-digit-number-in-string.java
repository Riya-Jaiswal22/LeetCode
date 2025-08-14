class Solution {
    public String largestGoodInteger(String num) {
        int i=0;
        char res='#';
        while(i<num.length()-2){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(res=='#') res=num.charAt(i);
                else if(res<num.charAt(i)) res = num.charAt(i);
            }
            i++;
        }
        if(res=='#') return "";
        return String.join("",String.valueOf(res).repeat(3));
    }
}