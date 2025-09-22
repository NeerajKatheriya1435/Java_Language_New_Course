
class Thread12 extends Thread{
    Thread12(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Sleepiing");
            }
            System.out.println("Khushi is cooking the food");
        }
    }
}
class Thread13 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Khushi is doing chat");
        }
    }
}

public class Day30 {
    public static void main(String[] args) {

        Thread12 t12=new Thread12("Vandana");

        Thread13 t13=new Thread13();

        t12.setPriority(Thread.MAX_PRIORITY);
        t13.setPriority(Thread.MIN_PRIORITY);

        t12.start();
//

        System.out.println(t12.getPriority());
        System.out.println(t13.getPriority());

//        System.out.println(t12.getId());
//        System.out.println(t13.getId());
//        try {
//            t12.join();
//        } catch (InterruptedException e) {
//            System.out.println("Exception Occured");
//        }
//        System.out.println("My thread name is: "+t12.getName());


        t13.start();

    }
}
