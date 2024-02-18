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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = new ListNode();
        while(current != null) {
            if(current.val == val) {
                if (current == head) {
                    head = current.next;
                    prev = current;
                }
                else {
                prev.next = current.next;
                }

            }
            else{
                prev =current;
            }
             current = current.next;
              
        }
        return head;
    }
}
