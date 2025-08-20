/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    boolean isCarry=false;
    int carry = 0;
    public Stack<Integer> add(Stack<Integer> s,int x){
        if(isCarry){
            x += carry;
            isCarry = false;
            carry = 0;
        }
        if(x>=10){
            s.push(x%10);
            carry = x/10;
            isCarry = true;
        }else{
            s.push(x);
        }
        return s;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        Stack<Integer> s3 = new Stack();
        ListNode temp = l1;
        int x;
        while(temp != null){
            s1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp != null){
            s2.push(temp.val);
            temp = temp.next;
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            x = s1.pop() + s2.pop();
            s3 = add(s3,x);
        }
        while(!s1.isEmpty()){
            x = s1.pop();
            s3 = add(s3,x);
        }
        while(!s2.isEmpty()){
            x = s2.pop();
            s3 = add(s3,x);
        }
        if(isCarry){
            s3.push(carry);
        }
        ListNode head = new ListNode(s3.pop(),null);
        temp = head;
        while(!s3.isEmpty()){
            ListNode newNode = new ListNode(s3.pop(),null);
            head.next = newNode;
            head = head.next;
        }
        return temp;
    }
}