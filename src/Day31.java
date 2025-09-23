import java.util.Scanner;

public class Day31 {

    public static int addTwo(int num1,int num2) throws ArithmeticException{
        return (num1/num2);
    }

    public static void main(String[] args) {
//        int age=89;
//        System.out.println("Hello hii kaise ho vandana");

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1=sc.nextInt();
//
//        System.out.println("Enter num2: ");
//        int num2=sc.nextInt();
//
//        System.out.println("The answer is: "+(num1/num2));

//        System.out.println(5+5/5+2*4-6);

        int[] arr={4,7,3,8};
//        System.out.println(arr[2]);
      Scanner sc=new Scanner(System.in);
      int ind=sc.nextInt();
        try{
            if(ind>4){
                throw new Exception("Error Generated");
            }
            System.out.println(arr[2]);

        } catch (Exception e) {
            System.out.println("Value not Found"+e);
        }


//        try {
//            Scanner sc= new Scanner(System.in);
//            int age=sc.nextInt();
//            if(age>18){
//                System.out.println("You can drive the car");
//            }
//        } catch (Exception e) {
//            System.out.println("Value is not correct");
//            System.out.println(e);
////            System.out.println(e.getMessage());
////            System.out.println(e.toString());
//        }

//        try {
//
//            int[] arr = new int[5];
//            arr[10] = 20; // ArrayIndexOutOfBoundsException
//            int a = 10 / 0; // ArithmeticException
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index out of range!");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero!");
//        }
//        catch (Exception e) { // generic handler
//            System.out.println("Some other error occurred: " + e);
//        }
//        System.out.println("This is very imp Line");

//        try{
//        int num1=45;
//            try {
//                int[] arr={6,3,8,9};
//                arr[35]=89;
//            } catch (Exception e) {
//                System.out.println("Index out Of Range V");
////                throw new RuntimeException(e);
//            }
//        } catch (Exception e) {
//            System.out.println("Be safe");
//            System.out.println("E");
//        }
//        System.out.println("This is my important");

//        int age=16;
//        if(age>18){
//            System.out.println("age is greater than 18");
//            System.out.println("you can drive the car");
//        }else{
//            throw new ArithmeticException("Your age is not valid");
//        }

//        System.out.println(addTwo(15,8));
//        System.out.println(addTwo(15,0));

//        try {
//            System.out.println(addTwo(8,0));
//        } catch (ArithmeticException e) {
//            System.out.println("second parameter must not be zero");
//        }
    }
}
