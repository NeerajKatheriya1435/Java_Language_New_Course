
interface connectivity{
    int age=78;
    void bluetooth();
    void wifi();
}

interface socialMedia{
    void instagram();
    void facebook();
    void wifi();
    default void camera(){
        System.out.println("Camera is working");
    }
//    static void twitter(){
//        System.out.println("Twitter is not working");
//    }
}

class SmartPhone implements connectivity,socialMedia{

    @Override
    public void bluetooth() {
        System.out.println("Bluetooth Connected");
    }

    @Override
    public void wifi() {
        System.out.println("Wifi is on");
    }

    @Override
    public void instagram() {
        System.out.println("Reel scrolling");
    }

    @Override
    public void facebook() {
        System.out.println("Facebook is good");
    }
}

public class Day27 {
    public static void main(String[] args) {
//        SmartPhone s1=new SmartPhone();
//        s1.bluetooth();
//        s1.instagram();
//        s1.camera();
//        s1.wifi();
//        connectivity.age=90;
//        System.out.println(connectivity.age);
//        socialMedia.twitter();
        connectivity s1=new SmartPhone();
        s1.bluetooth();
        s1.wifi();
//        s1.instagram();
        socialMedia m1=new SmartPhone();
        m1.instagram();
        m1.facebook();
        m1.wifi();

    }
}
