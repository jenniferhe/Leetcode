class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)return head;
        ListNode tmp = head;
        int size = 1;
        while(tmp.next != null){
            tmp = tmp.next;
            size++;
        }
        tmp.next = head;
        int step = size-k%size-1;
        ListNode node = head;
        for(int i=0;i<step;i++){
            node = node.next;
        }
        ListNode h = node.next;
        node.next = null;
        return h;
    }
}