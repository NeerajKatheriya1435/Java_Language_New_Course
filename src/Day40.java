import java.util.Scanner;

public class Day40 {

    public static boolean isPrime(int num){
        boolean b1=false;
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                b1=true;
                return b1;
            }
        }
        return b1;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//        int num=sc.nextInt();
//        if(num%2==0){
//            System.out.println("Number is Even "+num);
//        }else{
//            System.out.println("Number is Odd "+num);
//        }

        // largest between 3 numbers
        System.out.println("Enter the number you want sum");
        int num1=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=num1 ; i++) {
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();

//        if(num1>num2){
//            if(num1>num3){
//                System.out.println(num1+" is largest number");
//            }else{
//                System.out.println(num3+" is the greatest number");
//            }
//        }else{
//            if(num2>num3){
//                System.out.println(num2+" is the greatestt number");
//            }else {
//                System.out.println(num3+" is the greatest number");
//            }
//        }
//        if(num1>num2 && num1>num3){
//            System.out.println(num1+" is largest number");
//        } else if(num3>num1 && num3>num2 ) {
//            System.out.println(num3+" is largest number");
//        }else {
//            System.out.println(num2+" is the greatestt number");
//        }


//        for (int i = 2; i <num1 ; i++) {
//            if(num1%i==0){
//                System.out.println("The number is not Prime");
//                break;
//            }else{
//                System.out.println("Number is Prime");
//            }
//        }

//    if(isPrime(num1)){
//        System.out.println("number is not prime");
//    }else{
//        System.out.println("number is prime");
//    }
    }
}
