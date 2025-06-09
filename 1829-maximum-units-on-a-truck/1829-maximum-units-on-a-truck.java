class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res=0,box=0,i=0,n=boxTypes.length;
        Arrays.sort(boxTypes, (x, y) -> Integer.compare(y[1],x[1]));
        while(box<truckSize && i<n){
            if(boxTypes[i][0]+box<=truckSize){
                box += boxTypes[i][0];
                res += boxTypes[i][0]*boxTypes[i][1];
            }else{
                res += (truckSize-box)*boxTypes[i][1];
                box = truckSize;
            }
            i++;
        }
        return res;
    }
}