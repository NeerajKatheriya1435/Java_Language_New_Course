import java.util.Scanner;

public class DsaDay8 {

    static void dispplay(int[] arr){
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at "+i+" is: "+arr[i]);
        }
    }
    static void linearSearch(int[] arr,int data){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==data){
                System.out.println("Linear Serach Complted");
                System.out.println("Data Found at position: "+i);
                break;
            }
        }
    }
    static void binarySerach(int[] arr,int start,int end,int data){

       int mid=(start+end)/2;
       if(arr[mid]==data){
            System.out.println("Element Found at position: "+mid);
            return;
       } else if (arr[mid]>data) {
           end=(start+end)/2;
           binarySerach(arr,start,end,data);
           return;
       } else if (arr[mid]<data) {
           start=(start+end)/2;
           binarySerach(arr,start,end,data);
           return;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at position: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.toString());
        dispplay(arr);

        int data1=8;
//        linearSearch(arr,67);
        binarySerach(arr,0,arr.length-1,data1);

    }


}
