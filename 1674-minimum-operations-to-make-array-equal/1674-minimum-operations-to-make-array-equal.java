class Solution {
    public int minOperations(int n) {
        int i,j,s=0,target,res=0;
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i] = (2*i)+1;
            s += arr[i];
        }
        target = s/n;
        i=0;
        j=n-1;
        while(i<j){
            while(arr[i]!=target && arr[j]!=target){
                arr[i]-=1;
                arr[j]-=1;
                res++;
            }
            i++;
            j--;
        }
        return res;
    }
}