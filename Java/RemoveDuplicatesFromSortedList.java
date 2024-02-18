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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = new ListNode();
        while(current != null) {
            if(current == head) {
                prev = head;
                current= current.next;
            }
            else{
                if(current.val == prev.val) {
                    prev.next = current.next;
                }
                else{
                    prev = current;
                }
                current = current.next;
            }
        }
        return head;
    }
}
