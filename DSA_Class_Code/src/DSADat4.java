
class MyArray1{
    private int size;
    private int capacity;
    private int [] arr;

    public MyArray1(int capacity){
        this.capacity = capacity;
        arr = new int[capacity]; // arr[0]=67
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
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class DSADat4 {

    public static void main(String[] args) {

        MyArray1 array1= new MyArray1(12);
        array1.insert(45,0);
        array1.insert(55,1);
        array1.insert(99,2);
        array1.insert(22,1);
        array1.display();
    }
}
