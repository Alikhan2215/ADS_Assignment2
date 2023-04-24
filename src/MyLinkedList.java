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


    //8. Implement the remove(int index) method
    @Override
    public E remove(int index){
        checkIndex(index);

        // Traverse the list to the node at the specified index
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // Update the next and previous references of the surrounding nodes to remove the node from the list
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }

        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        size--;
        return current.element;
    }

    //9. Implement the size() method
    @Override
    public int size() {
        return size;
    }

    //10. Implement any other methods from MyList interface
    // Implement the contains(Object o) method
    @Override
    public boolean contains(Object o) {
        Node current = head;
        // While the current node is not null, iterate through the linked list.
        while (current != null) {
            // If the element in the current node is equal to the specified object, return true.
            if (current.element.equals(o)) {
                return true;
            }
            // Otherwise move to the next node in the linked list.
            current = current.next;
        }
        // If we reach the end of the linked list without finding the specified object, return false.
        return false;
    }

    // Implement the add(E item, int index)
    public void add(E item, int index) {
        checkIndex(index);

        // Create a new Node object with the specified item
        Node newNode = new Node(item, null, null);

        // If the list is currently empty, the new node becomes both the head and tail of the list
        if (size == 0) {
            head = tail = newNode;
        }
        // If the index is 0, the new node becomes the new head of the list
        else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        // If the index is equal to the size of the list, the new node becomes the new tail of the list
        else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        // Otherwise, traverse the list to find the node just before the specified index
        else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            // Get the previous node and insert the new node between the previous node and the current node
            Node prevNode = current.prev;
            newNode.prev = prevNode;
            newNode.next = current;
            prevNode.next = newNode;
            current.prev = newNode;
        }

        size++;
    }

    // Implement remove(E item) method
    @Override
    public boolean remove(E item) {
        // Traverse the list to find the node that contains the specified item
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                // If the node is the head of the list, set the head to the next node
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                }
                // If the node is the tail of the list, set the tail to the previous node
                else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                }
                // Otherwise remove the node by updating the next and previous nodes
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            // Move to the next node in the list
            current = current.next;
        }
        // If the item was not found in the list return false
        return false;
    }

    // Implement void clear() method
    @Override
    public void clear() {
        // Traverse the list from the head to the tail
        Node current = head;
        while (current != null) {
            Node next = current.next;
            // Set the references of the current node to null to release memory
            current.element = null;
            current.next = null;
            current.prev = null;
            // Move to the next node in the list
            current = next;
        }
        // Reset the head, tail, and size of the list
        head = null;
        tail = null;
        size = 0;
    }
    // Implement void sort() method
    @Override
    public void sort() {
        if (head != null) {
            Node current = null,
                    new_head = null,
                    move_node = null,
                    prev = null;
            while (head != null) {
                prev = null;
                current = head;
                move_node = head;
                while (current != null) {
                    // When current node value is greater than previous node
                    if (current.next != null && ((Comparable<E>) current.next.element).compareTo(move_node.element) > 0) {
                        //Swap node values
                        move_node = current.next;
                        prev = current;
                    }
                    current = current.next;
                }
                if (move_node == head) {
                    head = (head).next;
                }
                if (prev != null) {
                    prev.next = move_node.next;
                }
                move_node.next = new_head;
                new_head = move_node;
            }
            //make new head
            head = new_head;
        } else {
            System.out.println("Empty Linked list");
        }
    }

    // Implement indexOf(Object o) method
    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node current = head;
        // Loop until the end of the list
        while (current != null) {
            // Compare the element at the current node with the given object
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // Implement lastIndexOf(Object o) method

    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        Node current = tail;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }



}
