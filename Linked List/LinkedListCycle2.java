/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    //Hashmap approach:
//     public ListNode detectCycle(ListNode head) {
//         HashMap<ListNode, Boolean> visited = new HashMap<>();
        
//         ListNode t = head;
//         ListNode result = null;
//         while(t != null){
//             if(visited.containsKey(t)){
//                 result = t;
//                 break;
//             }else{
//                 visited.put(t, true);
//             }
            
//             t = t.next;
//         }
        
//         return result;
        
//     }
    
    //HashSet Approach
    public ListNode detectCycle(ListNode head) {    
       HashSet<ListNode> set = new HashSet<>();

       ListNode temp = head;
       while(temp != null){
           if(set.contains(temp)) return temp;

           set.add(temp);
           temp = temp.next;
       }

       return null;
        
    }

    //Space Complexity optimised approach:
    // public ListNode detectCycle(ListNode head) {    
    //     if(head == null){
    //         return head;
    //     }
        
    //     ListNode poi = pointOfIntersection(head);
    //     if(poi == null){
    //         return null;
    //     }
        
    //     ListNode slow = head;
    //     ListNode fast = poi;
        
    //     while(fast != slow){
    //         fast = fast.next;
    //         slow = slow.next;
    //     }
        
    //     return slow;
        
    // }
    
    // public static ListNode pointOfIntersection(ListNode head) {
    //    ListNode fast = head;
    //    ListNode slow = head;
    //    ListNode result = null;
    //    while(fast != null && fast.next != null){
    //        fast = fast.next.next;
    //        slow = slow.next;

    //        if(fast == slow){
    //            result = fast;
    //            break;
    //        }
    //    }

    //    return result;
    // }
    
    
}