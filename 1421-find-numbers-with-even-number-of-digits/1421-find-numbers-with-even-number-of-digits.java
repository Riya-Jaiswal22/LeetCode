class Solution {
    public int countDigits(int num){
        int c = 0;
        while(num>0){
            num = num/10;
            c++;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i : nums){
            if(countDigits(i)%2==0){
                c++;
            }
        }
        return c;
    }
}