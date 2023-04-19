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
        //Removing the element at the specified index, shifting all subsequent elements to the left by one position
        Object[] newArray = new Object[this.size - 1];
        for (int i = index + 1; i < this.size; i++){
            newArray[i-1] = array[i];
        }

        array = newArray;
        //decrementing the size variable.
        this.size--;

        return (T) array;

    }

    // Added checkIndex method to not repeat myself in method 'remove'
    public void checkIndex(int index){
        //If index is not in boundaries -> throw exception
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }


}
