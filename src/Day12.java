public class Day12 {

    static int addTwoNum(int a ,int b){
        a=78;// formal parameter
        return a-b;
    }

    static  void greet(){
        System.out.println("Hello Program");
//        return 67;
    }

    public static void main(String[] args) {

//        int num1=8;
//        int num2=5;
//        System.out.println(num1+num2);
//
//        int num3=8;
//        int num4=7;
//        System.out.println(num3+num4);
        greet();
        int s1=9;
        int s2=6;
        int result=addTwoNum(s1,s2); //12 //actual parameter
        System.out.println(result);
//        System.out.println(addTwoNum(8,6));
//        System.out.println(s1);
        greet();
    }
}
