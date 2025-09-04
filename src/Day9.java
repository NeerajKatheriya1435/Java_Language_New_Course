import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {

//        int[] arr;
//        arr=new int[20];
//        int[] arr={5,7,8,4,4,3,7,8};
//        Scanner sc=new Scanner(System.in);
        // storing the value in array
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the value at index "+i);
//            arr[i]=sc.nextInt();
//        }

        // traverse
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("The value at index "+i+" is "+arr[i]);
//        }
//        System.out.println(arr.length);

//        for (int item :arr){
//            System.out.println(item);
//        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
