import java.util.Scanner;

public class DSADay3 {
    // Function to insert element at given position
    public static int insertElement(int[] arr, int size, int element, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return size;
        }

        // Shift elements right to make space
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[pos] = element;
        size++; // increase current size
        return size; // return updated size
    }
    public static void main(String[] args) {
//        System.out.println("Array DS");

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int n=sc.nextInt();
//        int[] arr=new int[n];

//        int[] arr={3,6,8,2};
//        int n=4;
        // insert the data
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the the value at index: "+i);
//            arr[i]=sc.nextInt();
//        }

        // to traverse in array


        // to insert the value
//        int n = 5;
//        int pos = 2; // Insert at index 2
//        int x = 99;
//        for(int i = n; i > pos; i--)
//            arr[i] = arr[i - 1]; // shift right
//        arr[pos] = x;
//        n++; // new size
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        int arr[] = {10, 20, 30, 40, 50};
//        int n = 5;
//        int pos = 2; // Insert at index 2
//        int x = 99;
//        for(int i = n; i > pos; i--)
//            arr[i] = arr[i - 1]; // shift right
//        arr[pos] = x;
//        n++; // new size

        // searching

//        for (int i = 0; i <4 ; i++) {
//            if(arr[i]==13){
//                System.out.println("Element Found ");
//                break;
//            }
//        }




                Scanner sc = new Scanner(System.in);

                int capacity = 100; // maximum array size
                int[] arr = new int[capacity];

                System.out.print("Enter initial number of elements: ");
                int size = sc.nextInt();

                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                char choice;
                do {
                    System.out.print("\nEnter element to insert: ");
                    int element = sc.nextInt();

                    System.out.print("Enter position (0 to " + size + "): ");
                    int pos = sc.nextInt();

                    // Call function to insert
                    size = insertElement(arr, size, element, pos);

                    // Display array after insertion
                    System.out.print("Updated Array: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.print("\n\nDo you want to insert another element? (y/n): ");
                    choice = sc.next().charAt(0);

                } while (choice == 'y' || choice == 'Y');

                sc.close();

    }
}
