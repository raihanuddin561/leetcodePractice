package dsaPractice.linkedList;

public class LinkedListPract {
    public Node head;
    private Node tail;
    private int size;
    public LinkedListPract(){
        this.size=0;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.print("end");
    }
   public void insertFirst(int val){
        Node newNOde = new Node(val);
        newNOde.next=head;
        head=newNOde;
        if(tail==null) tail=head;
        size++;
   }
   public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
   }
   public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next =node;
        size++;
   }

   public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head==null) tail=null;
        size--;
        return val;
   }
   public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondeLast = get(size-2);
        int val = tail.val;
        tail=secondeLast;
        tail.next=null;
        return val;
   }
  public int delete(int index){
        if(index==0) return deleteFirst();
        if(size-1==index) return deleteLast();
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next= prev.next.next;
        return val;
  }
    private Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    private Node get(Node head,int index) {
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    private Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.val==value) return node;
            node = node.next;
        }
        return null;
    }

    public Node rotate(int k){
        Node last = head;
        int length =1;
        while (last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head;
        int rotations = k%length;
        int skip=length-rotations-1;
        Node newLast = head;
        for (int i=0;i<skip;i++){
            newLast=newLast.next;

        }
        head=newLast.next;
        newLast.next=null;
        return head;
    }
    public Node[] splitListToParts( int k) {
        int length=0;
        Node h=head;
        Node temp=h;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        Node[] nodeArr = null;
        if(k>length){
            nodeArr=new Node[k];
            Node n = head;
            for(int i=0;i<k;i++){
                head=n==null?null:n.next;
                if(n!=null){
                    n.next=null;
                }else{
                    n=null;
                }
                nodeArr[i]=n;
                n=head;
            }
        }else{
            int parts = length/k;
            int carry=length%k;
            nodeArr=new Node[k];
            Node node = head;
            Node prev=node;
            for(int i=0;i<k;i++){
                int start=0;
                int group=parts;
                if(carry>0){
                    group++;
                }
                    while(start<group){
                        prev=head;
                        head=head.next;
                        start++;
                    }
                head=prev.next;
                prev.next=null;
                nodeArr[i]=node;
                node=head;
                carry--;
            }
        }
        return nodeArr;


    }
    public Node[] splitListToParts2( int k) {
        int length=0;
        Node h=head;
        Node temp=h;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        Node[] nodeArr = new Node[k];
        int group=length/k;
        int carry=length%k;
        int i=0;
        Node curr = head;
        while (k>0){
            int l=group;
            if(carry>0){
                l++;
            }
            Node n = curr;
            while (curr!=null&&l-->1){
                curr=curr.next;
            }
            nodeArr[i]=n;
            if(curr==null) return nodeArr;
            Node next=curr.next;
            curr.next=null;
            curr=next;
            i++;
            k--;
            carry--;
        }
        return nodeArr;


    }

    public Node oddEvenList() {
        if(head==null||head.next==null||head.next.next==null) return head;
        Node odd = head;
        Node even = head.next;
        Node last = null;
        while (odd.next!=null){
            last=odd.next;
            if(last==null){
                break;
            }
            odd.next=last.next;
            if(odd.next==null){
                last.next=null;
                break;
            }
            last.next=odd.next.next;
            odd=odd.next;
        }
        odd.next=even;
        return head;
    }

    public void removeFromLast(int i) {
        Node node = head;
        int length = 0;
        while (node!=null){
            node=node.next;
            length++;
        }
        node=head;
        Node prev = null;
        Node curr = node;
//        prev.next=curr;
        int target=length-i;
        int count=0;
        while (curr!=null){
            if(count==target){
                curr=prev==null?curr.next:prev.next.next;
                break;
            }
            prev=curr;
            count++;
            curr=curr.next;
            prev.next=curr;
        }
        if(prev!=null)prev.next=curr;
        else {
            node=curr;
        }
        return;

    }
    public Node deleteMiddle() {
        Node slow = head;
        Node fast = head;
        Node curr = head;
        while (fast.next!=null){
            fast=fast.next.next;
            curr=slow;
            slow=slow.next;
            curr.next=slow;
        }
        curr.next=slow.next;
        return head;
    }
    public void reorderList() {
        Node curr = head;
        Node last = curr.next;
        while (head!=null){
            head=head.next;
            while (last.next!=null){
                last=last.next;
            }
            curr.next=last;
            curr.next.next=head;
            last=head.next;
        }
        return;
    }
    public Node swapPairs(Node head) {
        if(head==null) return head;
        if(head.next==null) return head;
        else{
            Node temp = head;
            head = head.next;
            temp.next = head.next;
            head.next = temp;
            head.next.next = swapPairs(head.next.next);
        }
        return head;
    }
    public Node swapNodes(Node head, int k) {
        Node firstPositionNode = head;
        Node secondPostionNode = head;
        Node firstNode = head, secondNode = head;
        for(int i=0;i<k-1;i++) firstPositionNode = firstPositionNode.next;
        firstNode = firstPositionNode;
        while (firstPositionNode.next!=null) {
            secondPostionNode = secondPostionNode.next;
            firstPositionNode = firstPositionNode.next;
        }
        secondNode = secondPostionNode;
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
        return head;
    }

    private int getNodeSize(Node head) {
        if(head==null) return 0;
        int counter = 0;
        Node temp = head;
        while (temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }

    public Node findMidle(){
        Node fast = head;
        Node slow = head;
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        head=slow;
        return slow;
    }

    public Node reverse(){
          if(head==null) return head;
          Node prev=null;
          Node curr = head;
          Node next = curr.next;
          while (curr!=null){
              curr.next=prev;
              prev=curr;
              curr=next;
              if(next!=null)
                next=next.next;
          }
          head=prev;
          return head;
    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
