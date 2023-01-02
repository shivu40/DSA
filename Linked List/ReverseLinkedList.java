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
    //Iterative Solution:
    // public ListNode reverseList(ListNode head) {
    //     if(head == null){
    //         return null;
    //     }
        
    //     ListNode prev = null;
    //     ListNode curr = head;
        
    //     while(curr != null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
        
    //     head = prev;
    //     return head;
    // }

    //Recursive Solution:
    public ListNode reverseRec(ListNode head, ListNode prev){
        if(head == null) return prev;

        ListNode next = head.next;
        head.next = prev;

        return reverseRec(next, head);
    }


    public ListNode reverseList(ListNode head) {
        return reverseRec(head, null);
    }
}