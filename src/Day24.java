
abstract class Human{

    void sing(){
        System.out.println("Please sing");
    }
    void cook(){
        System.out.println("Please not cook the food");
    }
    void sleep(){}
    abstract void go();
    abstract void vandana();
}

class Programmer extends Human{

    @Override
    void go() {
        System.out.println("Ready staedy go");
    }

    @Override
    void vandana() {

    }
}

public class Day24 {
    public static void main(String[] args) {

//        Human h1=new Human();
        Programmer p1=new Programmer();
        p1.sing();
        p1.go();
    }
}
