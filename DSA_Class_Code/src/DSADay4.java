class MyArray2{
    private int capacity;
    private int size;
    private int[] arr;

    MyArray2(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }

    public void insertElement(int elem,int pos){
        if (size == capacity) {
            System.out.println("Array is full! Cannot insert.");
            return;
        }
        if(pos<0 || pos>capacity){
            System.out.println("Invalid Index");
            return;
        }
        // it will shift all the ekement for the givent index in right side
        for (int i = size; i >pos ; i--) {
           arr[i]=arr[i-1];
        }
        arr[pos]=elem;
        size++;
    }

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

public class DSADay4 {
    public static void main(String[] args) {
//        int[] arr=new int[5];

//        arr[0]=1;
//        arr[0]=12;
//        arr[0]=15;
////        System.out.println(arr);

//        MyArray2 arr1=new MyArray2(10);
//        arr1.insertElement(23,0);
//        arr1.insertElement(43,1);
//        arr1.insertElement(56,2);
//        arr1.insertElement(22,1);
//        arr1.insertElement(90,0);
//        arr1.display();

        String str1="anna";

//        String reverse="";
//        for (int i = (str1.length()-1); i >=0 ; i--) {
//            reverse=reverse+str1.charAt(i);
//        }
////        System.out.println(reverse);
//        if(str1.equals(reverse)){
//            System.out.println("Palindrom String");
//        }else{
//            System.out.println("Not a Palindrom");
//        }
        int left=0;
        int right=str1.length()-1;
        boolean st1=false;
        for (int i = 0; i <str1.length() ; i++) {
            if(str1.charAt(left)==str1.charAt(right)){
                st1=true;
            }
            left++;
            right--;
        }
        if(st1){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not A palindrome");
        }
    }
}
