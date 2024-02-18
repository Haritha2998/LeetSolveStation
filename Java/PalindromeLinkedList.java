class Solution {
    ListNode headPtr;
    public boolean isPalindrome(ListNode head) {
        headPtr = head;
        return checkPalindrome(head); 
    }
    public boolean checkPalindrome(ListNode right) {
        if (right == null) return true;
        boolean ans = checkPalindrome(right.next);
        ans = ans && (right.val == headPtr.val);
        headPtr = headPtr.next;
        return ans;
    }
}
