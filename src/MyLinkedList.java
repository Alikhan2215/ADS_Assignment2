public class MyLinkedList<E> implements MyList<E> {

    //Define a private inner class called Node
    private class Node{
        //contains an element of type E
        E element;
        Node next;
        Node prev;

        //references to the next and previous nodes in the list.
        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    //Define a private instance variable called head
    private Node head;

    //Define a private instance variable called tail
    private Node tail;

}
