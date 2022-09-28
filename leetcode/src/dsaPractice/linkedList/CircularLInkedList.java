package dsaPractice.linkedList;

public class CircularLInkedList {

    private Node head;
    private Node tail;
    int size;
    public CircularLInkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            node.next=head;
            tail=head;
            size++;
            return;
        }
        node.next=head;
        head=node;
        tail.next=node;
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            node.next=head;
            tail=head;
            return;
        }
       // tail.next=node;
        node.next=head;
        tail.next=node;
        tail=node;
        //tail.next=head;
    }
    public int delete(int val){

        if(head==null){
            System.out.println("Val not found");
            return val;
        }
        Node node = head;
        if(node.val==val) {
            head=head.next;
            tail.next=head;
            return val;
        }
        do{
            Node n = node.next;
            if(n.val==val) {
                node.next=n.next;
                System.out.println("Value deleted");
                return val;
            }
            node=node.next;
        }while( node!=head);
        return val;
    }
    public void display(){
        if(head==null) {
            System.out.println("No elements found");
            return;
        }
        Node node = head;
       do{
            System.out.print(node.val+" -> ");
            node=node.next;
        } while (node!=head);
        System.out.println("end");
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
