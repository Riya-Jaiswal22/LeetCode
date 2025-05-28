class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,c1=0,c2=0;
        int i;
        for(i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                c1++;
                nums1[i] = 1;
            }
            sum1 += nums1[i]; 
        }
        for(i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                c2++;
                nums2[i] = 1;
            }
            sum2 += nums2[i];
        }
        if(sum1>sum2 && c2==0){
            return -1;
        }else if(sum2>sum1 && c1==0){
            return -1;
        }else{
            return Math.max(sum1,sum2);
        }
    }
}