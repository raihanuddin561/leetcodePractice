package dsaPractice.linkedList;

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private int size ;
    public DoublyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) head.prev=node;
        head=node;
        if(tail==null) tail=head;
        size++;

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp =tail;
        tail.next=node;
        node.prev=tail;
        tail=node;
    }
    public void insert(int val,int index){
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        Node prev = get(index-1);
        newNode.next= prev.next;
        prev.next=newNode;
        newNode.prev=prev;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        head.prev=null;
        return val;
    }
    public int deleteLast(){
        int val = tail.val;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    private Node get(int index) {
        Node node =head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
        while (node!=null) {
            System.out.print(node.val+"-> ");
            Node temp = node;
            node = node.next;
            //node.prev=temp;
        }
        System.out.println();
    }

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
