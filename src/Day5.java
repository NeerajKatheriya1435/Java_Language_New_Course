import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
//        if(conditin){
//
//        }else{
//
//        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age");
        int age=sc.nextInt();
        if(age<0 || age>120) {
            System.out.println("Invalid Age");
        }else if(age>=0 && age<=18){
            System.out.println("You can't drive the car You are kid");
        } else if (age>18 && age<=80) {
            System.out.println("You can drive the car");
        }else{
            System.out.println("You are overaged");
        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter you marks");
//        int marks=sc.nextInt();
//        if(marks>90){
//            System.out.println("You are good");
//        } else if (marks>50) {
//            System.out.println("Second Devision");
//        } else if (marks>30) {
//            System.out.println("Third Class");
//        }else {
//            System.out.println("Fail");
//        }
    }
}
