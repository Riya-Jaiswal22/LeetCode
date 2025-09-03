class Solution {
    public int numberOfPairs(int[][] points) {
        int i,j,res=0,n=points.length,k;
        boolean flag;
        for(i=0;i<n;i++){
            int x1=points[i][0],y1=points[i][1];
            for(j=0;j<n;j++){
                if(i==j) continue;
                int x2=points[j][0],y2=points[j][1];
                if(x1>x2 || y1<y2) continue;
                flag = true;
                for(k=0;k<n;k++){
                    if(i==k || j==k) continue;
                    int x=points[k][0],y=points[k][1];
                    if(x1<=x && x<=x2 && y1>=y && y>=y2){
                        flag = false;
                        break;
                    }
                }
                if(flag) res++;
            }
        }
        return res;
    }
}