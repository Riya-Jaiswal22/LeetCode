class MyStack {
    private Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()>1){
            q2.add(q.poll());
        }
        int x = q.poll();
        Queue<Integer> t = q;
        q = q2;
        q2 = t;
        return x;
    }
    
    public int top() {
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()>1){
            q2.add(q.poll());
        }
        int x = q.peek();
        q2.add(q.poll());
        Queue<Integer> t = q;
        q = q2;
        q2 = t;
        return x;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */