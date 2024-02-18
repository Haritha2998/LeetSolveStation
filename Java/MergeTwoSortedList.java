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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null && list2 == null) return list1;
       ListNode head = new ListNode();
       ListNode temp = new ListNode();
        while(list1 != null && list2 != null) {
            ListNode current = new ListNode();
            if(list1.val > list2.val) {
                current.val = list2.val;
                list2 = list2.next;
            }
            else{
                current.val = list1.val;
                list1 = list1.next;
            }
            current.next = null;
            if (head.val == 0) {
                head = current;
                temp = current;
            }
            else{
                temp.next = current;
                temp = current;
            }
        }
        while(list1 != null) {
            ListNode current = new ListNode();
            current.val = list1.val;
            list1 = list1.next;
            current.next = null;
            if (head.val == 0) {
                head = current;
                temp = current;
            }
            else{
                temp.next = current;
                temp = current;
            }
        }
        while(list2 != null) {
            ListNode current = new ListNode();
            current.val = list2.val;
            list2 = list2.next;
            current.next = null;
            if (head.val == 0) {
                head = current;
                temp = current;
            }
            else{
                temp.next = current;
                temp = current;
            }
        }
        return head;
    }
}
