class StockSpanner {
    List<ArrayList<Integer>> arr;
    public StockSpanner() {
        arr = new ArrayList<ArrayList<Integer>>();
    }
    
    public int next(int price) {
        int res = 1,i=arr.size()-1;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(price);
        arr.add(temp);
        while(i>=0 && arr.get(i).get(0)<=price){
            res++;
            i--;
        }
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */