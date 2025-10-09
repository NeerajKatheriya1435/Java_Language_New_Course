import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number you want resverse");
        int num1=sc.nextInt();
//        int reverseNum=0;
//        while (num1>0){
//            int lastDigit=num1%10;
//            reverseNum=(reverseNum*10)+lastDigit;
//            num1=num1/10;
//        }
//        System.out.println(num1);
//        System.out.println("The reverse num is: "+reverseNum);

        int user=num1;
        int reverseNum=0;
        while (num1>0){
            int lastDigit=num1%10;
            reverseNum=(reverseNum*10)+lastDigit;
            num1=num1/10;
        }
//        System.out.println(num1);
//        System.out.println("The reverse num is: "+reverseNum);

        if(reverseNum==user){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
