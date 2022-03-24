package leetcodeSolutions;

public class Solution2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next=null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }
    public ListNode head = null;
    public ListNode tail= null;
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            head =newNode;
            tail= newNode;
        }else {
            tail.next=newNode;
            tail = newNode;
        }

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(-1);
        ListNode current = output;
        int carry = 0;
        while (l1!= null || l2 != null) {
            int currentSum = 0;
            if (l1 != null) {
                currentSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentSum += l2.val;
                l2 = l2.next;
            }
            currentSum += carry;
            if (currentSum > 9) {
                carry = 1;
                currentSum = currentSum % 10;
            }else
            {
                carry=0;
            }

            current.next = new ListNode(currentSum);
            current = current.next;

        }
        if (carry == 1) {
            current.next = new ListNode(1);
        }

        return  output.next;
//        if (l1 == null && l2 == null) {
//            return null;
//        }
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            int currentSum = 0;
//            if (l1 != null) {
//                currentSum += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                currentSum += l2.val;
//                l2 = l2.next;
//            }
//            currentSum += carry;
//            if (currentSum > 9) {
//                currentSum = currentSum % 10;
//                carry = 1;
//            }
//            else {
//                carry = 0;
//            }
//            current.next = new ListNode(currentSum);
//            current = current.next;
//        }
//        if (carry == 1) {
//            current.next = new ListNode(1);
//        }
//        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode lList = new ListNode(2);
        lList = new ListNode(4,lList);
        lList = new ListNode(3, lList);

        ListNode lList2 = new ListNode(5);
        lList2 = new ListNode(6,lList2);
        lList2 = new ListNode(4, lList2);
//        while (lList!=null || lList2 !=null){
//            if(lList!=null){
//                System.out.println("llist:"+lList.val);
//                lList = lList.next;
//            }
//            if(lList2!=null){
//                System.out.println("llist2:"+lList2.val);
//                lList2=lList2.next;
//            }
//        }


        Solution2 s2 = new Solution2();

       ListNode listNode= s2.addTwoNumbers(lList,lList2);
        while (listNode!=null){
            System.out.print(listNode.val);
            listNode=listNode.next;
        }
    }

}
