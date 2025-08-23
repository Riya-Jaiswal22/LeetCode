class Solution {
    public String simplifyPath(String path) {
        int i=0,c;
        StringBuilder res = new StringBuilder();
        Stack<String> s = new Stack<>();
        StringBuilder temp = new StringBuilder();
        while(i<path.length()){
            if(path.charAt(i)=='/'){
                i++;
                continue;
            }else if(path.charAt(i)=='.'){
                c=0;
                while(i<path.length() && path.charAt(i)=='.'){
                    c++;
                    temp.append(".");
                    i++;
                }
                if(i == path.length() || path.charAt(i) == '/'){
                    if(c==1){
                    } else if(c==2){
                        if(!s.isEmpty()){
                            s.pop();
                        }
                    } else {
                        s.push(temp.toString());
                    }
                } else {
                    while(i<path.length() && path.charAt(i)!='/'){
                        temp.append(path.charAt(i));
                        i++;
                    }
                    s.push(temp.toString());
                }
                temp.setLength(0);
            }else{
                while(i<path.length() && path.charAt(i)!='/'){
                    temp.append(path.charAt(i));
                    i++;
                }
                s.push(temp.toString());
                temp.setLength(0);
            }
        }
        for (String dir : s) {
            res.append("/").append(dir);
        }
        return res.length() == 0 ? "/" : res.toString();
    }
}