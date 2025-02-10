class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long res = 0;
        int mod = 1_000_000_007;
        int n = arr.length;
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            int newTarget = target - arr[i];
            
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum < newTarget) {
                    left++;
                } else if (sum > newTarget) {
                    right--;
                } else { 
                    if (arr[left] == arr[right]) { 
                        int count = right - left + 1;
                        res += (count * (count - 1)) / 2;
                        res %= mod;
                        break;
                    } else {
                        int countLeft = 1, countRight = 1;
                        while (left + 1 < right && arr[left] == arr[left + 1]) {
                            countLeft++;
                            left++;
                        }
                        while (right - 1 > left && arr[right] == arr[right - 1]) {
                            countRight++;
                            right--;
                        }
                        res += (long) countLeft * countRight;
                        res %= mod;
                        left++;
                        right--;
                    }
                }
            }
        }
        return (int) res;
    }
}
