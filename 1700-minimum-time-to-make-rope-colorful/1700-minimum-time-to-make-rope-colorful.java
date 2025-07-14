class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0,j,n=colors.length(),res=0,maxTime;
        char ch;
        while(i<n-1){
            if(colors.charAt(i)==colors.charAt(i+1)){
                j = i;
                ch = colors.charAt(i);
                maxTime = neededTime[j];
                while(j<n && ch==colors.charAt(j)){
                    res += neededTime[j];
                    maxTime = Math.max(maxTime, neededTime[j]);
                    j++;
                }
                res -= maxTime;
                i = j;
            }else{
                i++;
            }
        }
        return res;
    }
}