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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;
        ListNode curr = head;

        int i = 1;
        
        while(curr != null){
            if(i % 2 == 1){
                oddTail.next = curr;
                oddTail = curr;
                curr = curr.next;
            }else{
                evenTail.next = curr;
                evenTail = curr;
                curr = curr.next;
            }
            i++;
        }
        
        oddTail.next = evenDummy.next;
        evenTail.next = null;
        
        
        return oddDummy.next;
    }
    
    
    
}