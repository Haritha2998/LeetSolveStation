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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slw = head;
        ListNode fst = head.next;
        while(slw != fst && fst.next != null && fst.next.next != null) {
            slw=slw.next;
            fst=fst.next.next;
        }
        if (fst.next == null || fst.next.next == null) return false;
        return true;
    }
}
