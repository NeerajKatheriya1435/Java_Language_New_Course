
@FunctionalInterface
interface happy{
    void khushi(int a,int b);
}

//class Vandana1 implements happy{
//
//    @Override
//    public void khushi() {
//        System.out.println("Vnadana is happy today");
//    }
//}

abstract class myMethod{
   abstract public void meth1();
   abstract public void meth2();
}

public class Day37 {
    public static void main(String[] args) {

//        Vandana1 v1=new Vandana1();
//        v1.khushi();
//        happy h1=new happy() {
//            @Override
//            public void khushi() {
//                System.out.println("I am khush v");
//            }
//        };
//        h1.khushi();

//        myMethod m1=new myMethod() {
//            @Override
//            public void meth1() {
//                System.out.println("I am very good");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("All are not");
//            }
//        };
//        m1.meth1();
//        m1.meth2();

//        Runnable r1= new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am running");
//            }
//        };
//        r1.run();

//        Runnable r2= ()->{System.out.println("hello i am good");};
//
//        r2.run(6,"Vanada");

        happy h1=(num1,num2)->{
            System.out.println("The sum is: "+(num1+num2));
        };
        h1.khushi(53,19);


    }
}
