class Solution {
    public int maxDistance(int[] colors) {
        int i,j,n=colors.length,res=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(colors[i]-colors[j]!=0){
                    res=Math.max(res,j-i);
                }
            }
        }
        return res;
    }
}