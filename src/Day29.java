
//class Thread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Vandana cooking food");
//        }
//    }
//}
//class Thread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Vandana doing chatting");
//        }
//    }
//}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Vandana cooking food");
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Vandana doing chatting");
        }
    }
}
class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Vandana is thinking");
        }
    }
}

public class Day29 {
    public static void main(String[] args) {



//        Thread1 t1= new Thread1();
//        Thread2 t2= new Thread2();
//        t1.start();
//        t2.start();

        Thread1 Bullet1= new Thread1();
        Thread2 Bullet2= new Thread2();
        Thread3 Bullet3= new Thread3();


        Thread t1= new Thread(Bullet1);
        Thread t2= new Thread(Bullet2);
        Thread t3= new Thread(Bullet3);

        t1.start();
        t2.start();
        t3.start();
    }
}
