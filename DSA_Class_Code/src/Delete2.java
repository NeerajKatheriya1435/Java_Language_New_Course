import java.util.Scanner;

class MyArray {
    private int[] arr;
    private int size; // current number of elements
    private int capacity; // total capacity

    // Constructor
    public MyArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Insert element at specific position
    public void insert(int element, int pos) {
        if (size == capacity) {
            System.out.println("Array is full! Cannot insert.");
            return;
        }
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        // Shift elements right
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        size++;
        System.out.println("Inserted " + element + " at position " + pos);
    }

    // Delete element at specific position
    public void delete(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            return;
        }
        System.out.println("Deleted element: " + arr[pos]);
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Update element at specific position
    public void update(int pos, int newValue) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            return;
        }
        System.out.println("Updated element " + arr[pos] + " → " + newValue);
        arr[pos] = newValue;
    }

    // Display array elements
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Current Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Delete2 {
//    static void insertElem(int pos,int num, int[]arr,int size){
//
//
//        for (int i = size; i > pos; i--) {
//            arr[i]=arr[i-1];
//        }
//        arr[pos]=num;
//        size++;
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        int size=5;
//        int[] arr=new int[100];
//
//        System.out.println("Enter "+size+ " element");
//        for (int i = 0; i < size; i++) {
//            arr[i]=sc.nextInt();
//        }
//        int num=67;
//        int pos=2;
//        int pos1=1;
//    }
public static void main(String[] args) {
    MyArray myArray=new MyArray(89);
    myArray.insert(34,0);
    myArray.insert(89,1);
    myArray.insert(45,2);
    myArray.insert(35,1);
    myArray.display();
}
}
