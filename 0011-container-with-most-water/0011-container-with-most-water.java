class Solution {
    public int maxArea(int[] height) {
        int res=0,i=0,j=height.length-1,x;
        while(i<j){
            x = (j-i)*Math.min(height[i],height[j]);
            res = Math.max(res,x);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}