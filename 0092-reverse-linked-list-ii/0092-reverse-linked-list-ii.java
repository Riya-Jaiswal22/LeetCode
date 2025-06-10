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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        ListNode prev=null,curr=head,next=null;
        int i=1;
        while(i<left){
            start = start.next;      
            i++;
        }
        curr = start.next;
        while(i<=right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        ListNode leftNode = start.next;
        start.next = prev;
        leftNode.next = curr;
        return dummy.next;
    }
}