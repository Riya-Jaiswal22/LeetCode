class Solution {
    public int minMaxDifference(int num) {
        StringBuilder min = new StringBuilder(Integer.toString(num));
        StringBuilder max = new StringBuilder(Integer.toString(num));
        int i=0;
        char ch;
        while(i<max.length() && max.charAt(i)=='9') i++;
        if(i!=max.length()){
            ch = max.charAt(i);
            while(i<max.length()){
                if(max.charAt(i)==ch){
                    max.setCharAt(i,'9');
                }
                i++;
            }
        }
        i=0;
        while( i<min.length() && min.charAt(i)=='0') i++;
        if(i!=min.length()){
            ch = min.charAt(i);
            while(i<min.length()){
                if(min.charAt(i)==ch) min.setCharAt(i,'0');
                i++;
            }
        }
        return Integer.parseInt(max.toString())-Integer.parseInt(min.toString());
    }
}