package leetcodeSolutions;


public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node!=null){
            int val = node.val;
            ListNode nextNode = node.next==null?null:node.next;
            while (nextNode!=null&&nextNode.val==val){
                nextNode=node.next.next;
            }
            node=nextNode;
        }
        return node;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

