import java.util.Arrays;

public class Day17 {

//    static void addTwoNum(int a){
//        System.out.println("Hello "+a);
//    }
//    static void addTwoNum(int a,int b){
//        System.out.println(a);
//        System.out.println(b);
//    }
//    static void area(int side){
//        System.out.println("The area of square is: "+(side*side));
//    }
//    static void area(int l,int b){
//        System.out.println("The area of rectangle is: "+(l*b));
//    }
//    static void area(int l,int b,int h){
//        System.out.println("The area of rectangle is: "+(l*b*h));
//    }

    void area(int ...arr){
        int sum=0;
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Day17 obj1=new Day17();

        obj1.area(6);
//        area(5,8);
//        area(5,8,7);
    }
}
