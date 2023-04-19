public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Clown");
        System.out.println("Element '"+ arrayList.remove(0)+ "' was removed");
        System.out.println("Element at the required index is '" + arrayList.get(0) + "'");
        System.out.println("'Clown' is at the index " + arrayList.indexOf("Clown"));
        arrayList.clear();
        arrayList.add("Coca-Cola");
        System.out.println("First element of update array is: "+ arrayList.get(0));
        System.out.println("Size of an array is: " + arrayList.size());

        MyArrayList<Integer> intList = new MyArrayList();
        intList.add(6);
        intList.add(2);
        intList.add(3);
        intList.sort();
        System.out.print("Sorted list: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " "); // print each element in the list
        }
    }
}