public class Main {
    public static void main(String[] args) {
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
    }
}