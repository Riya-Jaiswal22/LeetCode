/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = lengthList(headA), lb = lengthList(headB);
        int diff = la-lb;
        ListNode tempA = headA, tempB = headB;
        if(diff>0){
            while(diff!=0){
                tempA = tempA.next;
                diff--;
            }
        }else{
            while(diff!=0){
                tempB = tempB.next;
                diff++;
            }
        }
        while(tempA!=null || tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
    public int lengthList(ListNode head){
        int n=0;
        while(head!=null){
            n++;
            head = head.next;
        }
        return n;
    }
}