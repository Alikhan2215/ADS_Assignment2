public class MyArrayList<T> implements MyList<T> {
    //2. Define a private instance variable of type Object[] to hold the elements of the list.
    private Object[] array;
    //3. Define an int variable called size to keep track of the number of elements in the list.
    private int size = 0;
    //4. Implement the add(E element)
    @Override
    public void add(T item){
        //First checking if the size of the array is large enough to accommodate the new element
        if (this.size == array.length){
            //If it is not, create a new array with double the size of the original array
            Object[] newArray = new Object[array.length * 2];

            //Copy over the elements from the original array
            for (int i = 0; i < this.size; i++){
                newArray[i] = array[i];
            }

            array = newArray;
        }

        //simply add the new element to the end of the array and increment the size variable
        array[this.size] = item;
        this.size++;
    }

}
