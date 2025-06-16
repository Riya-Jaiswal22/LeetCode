class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target=='z') return letters[0];
        int n=letters.length,low=0,high=n-1,mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(letters[mid]<=target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return letters[low%n];
    }
}