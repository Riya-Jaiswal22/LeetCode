class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length,i,res=0;
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i] = 1;
            if(i!=0 && ratings[i-1]<ratings[i]){
                arr[i] = arr[i-1] + 1;
            }
        }
        for(i=n-1;i>=0;i--){
            if(i!=n-1 && ratings[i]>ratings[i+1] && arr[i]<=arr[i+1]){
                arr[i] = arr[i+1]+1;
            }
            res += arr[i];
        }
        return res;
    }
}