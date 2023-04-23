public class MyLinkedList<E> implements MyList<E> {

    //2. Define a private inner class called Node
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
    //3. Define a private instance variable called head
    private Node head;

    //4. Define a private instance variable called tail
    private Node tail;

    //5. Define an int variable called size to keep track of the number of elements in the list
    private int size;

    //6. Implement the add(E element) method
    @Override
    public void add(E element){
        // Creating a new Node with the specified element, setting its next reference to null
        // (since it will be the new tail), and its previous reference to the current tail
        Node newNode = new Node(element, null, tail);
        // If the list is empty, set both the head and tail references to the new node
        if (tail == null){
            head = newNode;
        }
        // Otherwise, set the next reference of the current tail to the new node and update the tail
        // reference to the new node
        else{
            tail.next = newNode;
        }
        tail = newNode;
        // Finally, increment the size variable
        size++;
    }

    //7. Implement the get(int index) method


    // Added checkIndex method to not repeat myself
    public void checkIndex(int index){
        // If index is not in boundaries -> throw exception
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E get(int index){
        checkIndex(index);

        // If the index is less than or equal to half of the size of the list - traverse from the head
        Node current;
        if (index <= size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        // Otherwise, traverse from the tail
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }


}
