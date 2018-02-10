// 234. Palindrome Linked List

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2.next != null && p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode secondHead = p1.next;
        p1.next = null;
        p1 = secondHead;
        p2 = secondHead.next;
        secondHead.next = null;
        while(p2!=null){
            ListNode tmp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = tmp;
        }
        ListNode p3 = head;
        while(p1!=null){
            if(p1.val!=p3.val) return false;
            p1 = p1.next;
            p3 = p3.next;
        }
        return true;
    }
}