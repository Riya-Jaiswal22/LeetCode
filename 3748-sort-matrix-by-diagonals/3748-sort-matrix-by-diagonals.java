class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int start = n - 1; start >= 0; start--) {
            ArrayList<Integer> list = new ArrayList<>();
            int r = start, c = 0;
            while (r < n && c < n) {
                list.add(grid[r][c]);
                r++;
                c++;
            }
            list.sort((a,b)->b-a);
            r = start; c = 0;
            int i = 0;
            while (r < n && c < n) {
                grid[r][c] = list.get(i++);
                r++;
                c++;
            }
        }

        for (int start = 1; start < n; start++) {
            ArrayList<Integer> list = new ArrayList<>();
            int r = 0, c = start;
            while (r < n && c < n) {
                list.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);  
            r = 0; c = start;
            int i = 0;
            while (r < n && c < n) {
                grid[r][c] = list.get(i++);
                r++;
                c++;
            }
        }
        return grid;
    }
}
