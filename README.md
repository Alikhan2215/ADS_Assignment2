# ADS_Assignment2
## MyArrayList
- **Method int size()**: *returns the size variable*

- **Method void add(T item)**: *adds an item to the end of the array firstly checking if the size of the array is large enough to accommodate the new element. If it is not, 
create a new array with double the size of the original array. Copy over the elements from the original array. Then add the new element to the end of the array and increment the size variable*

- **Method void add(T item, int index)**: *adds an element on the specified index and shifts elements to the right by 1*

- **Method boolean remove(T item)**: *If the element is found and removed then the method returns true. If the element is not found in the array then it returns false*

- **Method T remove(int index)**: *If index is not in boundaries -> throw exception. Shift all elements to the left of the specified index by 1. Decrement size. Return removed item*

- **Method void clear()**: *clears an array*

- **Method T get(int index)**: *return index of an array*

- **Method int indexOf(Object o)**: *searches for the FIRST occurrence of the specified element in the array and returns the index at which its found. 
If the element is not found in the array then it returns -1*

- **Method int lastIndexOf(Object o)**: *searches for the LAST occurrence of the specified element in the array and returns the index at which its found. 
If the element is not found in the array then it returns -1*

- **Method void sort()**: *sorts an array in ascending order*

## MyLinkedList
- **Method int size():** *returns the size variable*

- **Method void add(E element):** *adds an element to the end of the list*

- **Method void add(int index, E element):** *adds an element on the specified index and shifts elements to the right by 1*

- **Method boolean remove(Object o):** *removes the FIRST occurrence of the specified element in the list, if it is found. Returns true if the element was removed, false otherwise*

- **Method E remove(int index):** *If index is not in boundaries -> throw exception. Removes and returns the element at the specified index. Shifts all elements to the left of the specified index by 1. Decrement size*

- **Method void clear():** *clears the list*

- **Method E get(int index):** *returns the element at the specified index*

- **Method int indexOf(Object o):** *searches for the FIRST occurrence of the specified element in the list and returns the index at which it is found. If the element is not found in the list then it returns -1*

- **Method int lastIndexOf(Object o):** *searches for the LAST occurrence of the specified element in the list and returns the index at which it is found. If the element is not found in the list then it returns -1*

- **Method void sort():** *sorts the list using the bubble sort algorithm*
