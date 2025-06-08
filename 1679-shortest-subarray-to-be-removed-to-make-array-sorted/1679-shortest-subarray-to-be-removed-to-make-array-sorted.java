class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int i=0,n=arr.length,res=0,j;
        while(i<n-1 && arr[i]<=arr[i+1]) i++;
        if(i==n-1) return 0;
        j = n-1;
        while(j>0 && arr[j]>=arr[j-1]) j--;
        res = Math.min(n-i-1,j);
        int left=0,right=j;
        while(left<=i && right<n){
            if(arr[left]<=arr[right]){
                res = Math.min(res,right-left-1);
                left++;
            }else{
                right++;
            }
        }
        return res;
    }
}