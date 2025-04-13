class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = getMax(piles), ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return ans;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            time += Math.ceil((double) pile / k);
            if (time > h) return false;
        }
        return true;
    }
}
