public class DSA1 {

//    public static void checkLeapYear(int year){

        // conditions for leap year
        // 2024
        //
//        if((year%400==0) || (year%4==0 && year%100!=0)){
//            System.out.println("Year is Leap Year");
//        }else{
//            System.out.println("Not a leap Year");
//        }
//    }

//    public static int findGCDFunc(int num1,int num2){
//
//        while (num2!=0){
//            int temp=num2;
//            num2=num1%num2;
//            num1=temp;
//        }
//        return  num1;
//    }

//    public static int findLCM(int a,int b){
//
//        int max=(a>b)?a:b;
//        while (true){
//            if(max%a==0 && max%b==0){
//                return max;
//            }
//            else{
//                max++;
//            }
//        }
//    }

    public static void checkArmStrong(int num){

        int temp=num;
        int count=0;
        int sum=0;

        while ((temp > 0)) {
            temp=temp/10;
            count=count+1;
        }
        temp=num;
        while ((temp > 0)) {
            int lastDigit=temp%10;
            sum = (int) (sum+(Math.pow(lastDigit,count)));
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("It is a armstrong number");
        }else{
            System.out.println("Not a ArmStrong");
        }
    }

    public static void main(String[] args) {
//    checkLeapYear(2200);
//        int num1=12;
//        int num2=16;

//        System.out.println(findGCDFunc(num1,num2));
//        System.out.println("The LCM is: "+((num1*num2)/findGCDFunc(num1,num2)));
//        System.out.println(findLCM(num1,num2));

    checkArmStrong(1634);
    }
}
