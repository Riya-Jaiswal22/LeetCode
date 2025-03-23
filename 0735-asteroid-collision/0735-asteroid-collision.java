class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int asteroid : asteroids) {
            while (!s.isEmpty() && s.peek() > 0 && asteroid < 0) {
                int top = s.pop();
                if (Math.abs(top) > Math.abs(asteroid)) {
                    asteroid = top; 
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    asteroid = 0; 
                }
            }
            if (asteroid != 0) {
                s.push(asteroid);
            }
        }
        
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        
        return res;
    }
}
