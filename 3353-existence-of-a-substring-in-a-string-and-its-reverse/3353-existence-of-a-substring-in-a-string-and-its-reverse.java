class Solution {
    public boolean isSubstringPresent(String s) {
        ArrayList<String> arr1 = new ArrayList<>();
        int i;
        for(i=0;i<s.length()-1;i++){
            arr1.add(s.substring(i,i+2));
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String r = sb.toString();
        ArrayList<String> arr2 = new ArrayList<>();
        System.out.println("reverse");
        for(i=0;i<r.length()-1;i++){
            arr2.add(r.substring(i,i+2));
        }
        for(i=0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                if(arr1.get(i).equals(arr2.get(j))) return true;
            }
        }
        return false;
    }
}