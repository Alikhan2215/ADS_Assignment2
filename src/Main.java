public class Main {
    public static void main(String[] args) {
        /*
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Clown");
        System.out.println("Element '"+ arrayList.remove(0)+ "' was removed");
        System.out.println("Element at the required index is '" + arrayList.get(0) + "'");
        arrayList.clear();
        arrayList.add("Coca-Cola");
        System.out.println("First element of update array is: "+ arrayList.get(0));
        System.out.println("Size of an array is: " + arrayList.size());

        if(arrayList.contains("Coca-Cola")){
            System.out.println("Coca-Cola is in array");
        }
        else{
            System.out.println("Coca-Cola is not in array");
        }

        if(arrayList.remove("Coca-Cola")){
            System.out.println("Item 'Coca-Cola was removed'");
        }
        else{
            System.out.println("Item 'Coca-Cola was not removed'");
        }

        MyArrayList<Integer> intList = new MyArrayList();
        intList.add(6);
        intList.add(2);
        intList.add(3);
        intList.add(2);
        System.out.print("List of integers: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " "); // print each element in the list
        }
        System.out.println("");
        System.out.println("First encounter with required item is at index: " + intList.indexOf(2));
        System.out.println("Last encounter with required item is at index: " + intList.lastIndexOf(2));

        intList.sort();
        System.out.print("Sorted list of integers: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " "); // print each element in the list
        }

        System.out.println();
        MyLinkedList<String> list = new MyLinkedList<>();

        // Add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("LINKED LIST");
        // Test size and contains
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'banana': " + list.contains("banana"));
        System.out.println("Contains 'orange': " + list.contains("orange"));

        // Test add and add with index
        list.add("date");
        list.add("elderberry", 2);
        System.out.println("After adding two elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Test remove and remove with index
        list.remove("banana");
        System.out.println("After removing 'banana': ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(1);
        System.out.println("After removing element at index 1: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Test clear
        list.clear();
        System.out.println("After clearing the list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Add some more elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Test get and indexOf
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Index of 'banana': " + list.indexOf("banana"));

        // Test lastIndexOf
        list.add("banana");
        System.out.println("Last index of 'banana': " + list.lastIndexOf("banana"));

        // Test sort
        MyLinkedList<Integer> intList2 = new MyLinkedList<>();
        intList2.add(4);
        intList2.add(2);
        intList2.add(7);
        System.out.println("Before sorting the int list: ");
        for (int i = 0; i < intList2.size(); i++) {
            System.out.print(intList2.get(i) + " ");
        }
        System.out.println();
        intList2.sort();
        System.out.println("After sorting the int list: ");
        for (int i = 0; i < intList2.size(); i++) {
            System.out.print(intList2.get(i) + " ");
        }
        System.out.println();

         */

        MyArrayList<Integer> array = new MyArrayList<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(2);
        array.add(2);
        System.out.println("Array before deleting duplicates: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println("Array after deleting duplicates: ");
        array.deleteDuplicates();
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}