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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||  k==0) return head;
        ListNode tail=head,temp=head;
        int n=1;
        while(tail.next!=null){
            n++;
            tail = tail.next;
        }
        tail.next = head;
        k = k%n;
        if(k==0){ 
            tail.next = null;
            return head;
        }
        for(int i=0;i<n-k-1;i++){
            temp = temp.next;
        }
        ListNode newList = temp.next;
        temp.next = null;
        return newList;
    }
}