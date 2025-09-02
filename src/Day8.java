import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
//        float result=5*4+8-4/2; //12  //
        // 20+8-2
        //28-2=26
//        byte b1=6;
//        byte b2=89;
//        int result1=b1+b2;
//        float fl1=7.55f;
//        float res=result1+fl1;
//        double var1=res+7.88;
//        System.out.println(result1);
//        System.out.println(res);
//        System.out.println(var1);
//        int[] arr=new int[20];

//        arr[0]=7;
//        arr[1]=5;
//        arr[3]=6;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[19]);
        int[] arr;
        arr=new int[20];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the value at index "+i);
            arr[i]=sc.nextInt();;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("The value at index "+i+"is "+arr[i]);
        }



    }
}
