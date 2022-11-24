package dsaPractice.linkedList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        LinkedListPract listPract = new LinkedListPract();
       // listPract.insertLast(0);
        listPract.insertLast(1);
        listPract.insertLast(2);
      //  listPract.insertLast(2);
        listPract.insertLast(3);
        listPract.insertLast(4);
        listPract.insertLast(5);
       /* listPract.insertLast(1);
        listPract.insertLast(2);
        listPract.insertLast(6);*/
        listPract.display();
        listPract.removeElements(listPract.head,2);
        listPract.display();
        //listPract.reorderList();
       // listPract.deleteMiddle();
       // System.out.println(Arrays.toString(listPract.splitListToParts2(3)));
        //listPract.oddEvenList();
       // listPract.display();
       // listPract.removeFromLast(2);
        /*listPract.insert(10,2);
        listPract.display();
        listPract.delete(2);
        listPract.display();*/

      /*  DoublyLinkedList listPract = new DoublyLinkedList();
        *//*listPract.insertFirst(4);
        listPract.insertFirst(5);
        listPract.insertFirst(6);
        listPract.insertFirst(7);*//*
        listPract.insertLast(4);
        listPract.insertLast(5);
        listPract.insertLast(6);
        listPract.insertLast(7);
        listPract.display();
        listPract.insert(10,2);
        listPract.display();
        System.out.println("Deleted: "+listPract.deleteFirst());
        listPract.display();
        System.out.println("Deleted: "+listPract.deleteLast());
        listPract.display();*/
      //  listPract.delete(2);
       // listPract.display();


        /*CircularLInkedList ccl = new CircularLInkedList();
        ccl.insertLast(7);
        ccl.insertLast(6);
        ccl.insertLast(3);
        ccl.insertLast(9);
        ccl.insertLast(11);
        ccl.display();
        */
       // System.out.println( ccl.delete(9));
      //  ccl.display();




    }
}
