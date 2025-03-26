class MinStack {
    int m = Integer.MAX_VALUE;
    Stack<Integer> s;
    Stack<Integer> minStack; 
    public MinStack() {
        s = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val); 
        }
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        if (s.peek().equals(minStack.peek())) {
            minStack.pop(); 
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()) return Integer.MAX_VALUE;
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */