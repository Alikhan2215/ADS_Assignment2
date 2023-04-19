import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    //2. Define a private instance variable of type Object[] to hold the elements of the list.
    private Object[] array;
    //3. Define an int variable called size to keep track of the number of elements in the list.
    private int size = 0;

    public MyArrayList(){
        this.array = new Object[5];
        this.size = 0;
    }

    //4. Implement the add(E element)
    @Override
    public void add(T item){
        //First checking if the size of the array is large enough to accommodate the new element
        if (this.size == array.length){
            //If it is not, create a new array with double the size of the original array
            Object[] newArray = new Object[array.length * 2];

            //Copy over the elements from the original array
            System.arraycopy(array, 0, newArray, 0, this.size);

            array = newArray;
        }

        //simply add the new element to the end of the array and increment the size variable
        array[this.size] = item;
        this.size++;
    }

    //5. Implement the get(int index) method
    @Override
    public T get(int index){
        //If index is not in boundaries -> throw exception
        checkIndex(index);
        //Return index of an array
        return (T) array[index];
    }

    //6. Implement the remove(int index) method
    @Override
    public T remove(int index){
        //If index is not in boundaries -> throw exception
        checkIndex(index);
        T removedItem = (T) array[index];
        // Shift all elements to the left of the specified index by 1
        System.arraycopy(array, index + 1, array, index, this.size - index - 1);
        this.size--;
        array[size] = null;
        return removedItem;

    }

    // Added checkIndex method to not repeat myself in method 'remove'
    public void checkIndex(int index){
        //If index is not in boundaries -> throw exception
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }

    //7. Implement the size() method
    @Override
    public int size(){
        //returning the size variable
        return this.size;
    }

    //8. Implement any other methods specified by the List interface
    // Implement method contains which tells if is there an Object o
    @Override
    public boolean contains(Object o){
        for (int i = 0; i < this.size; i++){
            if (array[i].equals(o)){
                return true;
            }
        }   return false;
    }

    // Implement method add(T item, int index) which adds an element on the specified index and shifts elements
    // to the right by 1
    @Override
    public void add(T item, int index) {
        checkIndex(index);
        if (this.size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            // Copy the elements before inserting index to the new array
            System.arraycopy(array, 0, newArray, 0, index);
            // Insert the new element at the specified index
            newArray[index] = item;
            // Copy the elements after inserting index to the new array
            System.arraycopy(array, index, newArray, index + 1, size - index);
            array = newArray;
        } else {
            // Shift the existing elements to the right of the specified index by one position
            System.arraycopy(array, index, array, index + 1, size - index);
            // Insert the new element at the specified index
            array[index] = item;
        }
        this.size++;
    }

    // Implement method boolean remove
    // If the element is found and removed then the method returns true. If the element is not found in the array then
    // it returns false
    @Override
    public boolean remove(T item){
        for (int i=0; i < this.size; i++){
            // Check if the current element is equal to the specified element
            if (array[i].equals(item)) {
                // Shift all elements after the current element to the left
                System.arraycopy(array, i + 1, array, i, this.size - i - 1);
                this.size--;
                array[this.size] = null;
                return true;
            }
        }
        return false;
    }


    // Implement method clear which clears an array
    @Override
    public void clear(){
        this.array = new Object[5];
        this.size = 0;
    }


    // Implement method indexOf which searches for the first occurrence of the specified element in the
    // array and returns the index at which its found. If the element is not found in the array then it returns -1
    @Override
    public int indexOf(Object o){
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }


    // Implement method indexOf which searches for the LAST occurrence of the specified element in the
    // array and returns the index at which its found. If the element is not found in the array then it returns -1
    @Override
    public int lastIndexOf(Object o){
        for (int i = this.size - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // Implement method sort which sorts an array in ascending order
    @Override
    public void sort(){
        Arrays.sort((T[]) array, 0, this.size);
    }

}
