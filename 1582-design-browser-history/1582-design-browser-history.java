class BrowserHistory {
    public class Node {
        String url;
        Node prev;
        Node next;

        public Node(String url)
        {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage); 
    }
    
    public void visit(String url) {
        Node prev = curr;
        curr.next = new Node(url);
        curr = curr.next;
        curr.prev = prev;
    }
    
    public String back(int steps) {
        int i=0;
        while(curr.prev!=null && i<steps){
            curr = curr.prev;
            i++;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        int i=0;
        while(curr.next!=null && i<steps){
            curr = curr.next;
            i++;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */