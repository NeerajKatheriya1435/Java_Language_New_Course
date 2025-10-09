public class Deelte {

//    public static int findGCD(int num1,int num2){

//        while (num2!=0){
//            int temp=num2;
//            num2=num1%num2;
//            num1=temp;
//        }
//        return num1;


//        int max=(num1>num2)?num1:num2;
//
//        while (true){
//            if(max%num1==0 && max%num2==0){
//                return max;
//            }
//            max++;
//        }
//    }
//    public static boolean checkArmStrong(int num){
//        boolean b1=false;
//
//        int temp=num;
//        int count=0;
//        int sum=0;
//
//        while (temp>0){
//            temp/=10;
//            count+=1;
//        }
////        System.out.println("The Total Digits are: "+count);
//        temp=num;
//        while (temp>0){
//            int lastDigit=temp%10;
//            sum+=Math.pow(lastDigit,count);
//            temp/=10;
//        }
//
//        if(sum==num){
//            b1=true;
//            return b1;
//        }
//        return b1;
//    }
public static void sortBub(int[] arr){

    for (int i = 0; i < 4 ; i++) {
        for (int j = 0; j < 3 ; j++) {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println(arr.toString());
}
    public static void main(String[] args) {
//        System.out.println(findGCD(12,8));
//        if(checkArmStrong(1635)){
//            System.out.println("Number is Armstrong");
//        }else{
//            System.out.println("Number is not");
//        }

        int[] arr={5,6,8,3};
        sortBub(arr);
    }
}
