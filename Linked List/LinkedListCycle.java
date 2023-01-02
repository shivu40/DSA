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
//     public boolean hasCycle(ListNode head) {
//         HashMap<ListNode, Boolean> visited = new HashMap<>();
        
//         ListNode t = head;
        
//         while(t != null){
//             if(visited.containsKey(t)){
//                 return true;
//             }else{
//                 visited.put(t, true);
//             }
            
//             t = t.next;
//         }
        
//         return false;
//     }

    //Using Hashset
    public  boolean hasCycle(ListNode head) {
       HashSet<ListNode> set = new HashSet<>();

       ListNode temp = head;
       while(temp != null){
           if(set.contains(temp)) return true;

           set.add(temp);
           temp = temp.next;
       }

       return false;
    }
    
    //Without hashmap: Space Complexity O(1);
    //  public  boolean hasCycle(ListNode head) {
    //    ListNode fast = head;
    //    ListNode slow = head;

    //    while(fast != null && fast.next != null){
    //        fast = fast.next.next;
    //        slow = slow.next;

    //        if(fast == slow){
    //            return true;
    //        }
    //    }

    //    return false;
    // }
}