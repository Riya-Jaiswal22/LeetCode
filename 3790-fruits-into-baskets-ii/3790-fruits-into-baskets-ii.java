class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length,i,j,c=0;
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(fruits[i]<=baskets[j] && arr[j]==0){
                    arr[j] = 1;
                    break;
                }
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]==0){
                c++;
            }
        }
        return c;
    }
}