
interface Student{

    void study();
    void play();
}

interface Player{
    void eat();
    void walk();
    default void sing(){
        System.out.println("You can not sing");
    };
}

class Teacher implements Student,Player{

    @Override
    public void study() {
        System.out.println("Good Student");
    }

    @Override
    public void play() {
        System.out.println("You can play");
    }

    @Override
    public void eat() {
        System.out.println("Eating the food");
    }

    @Override
    public void walk() {
        System.out.println("Player can walk");
    }
}

public class day25 {
    public static void main(String[] args) {

        Teacher t1=new Teacher();
        t1.play();
        t1.study();
        t1.walk();
        t1.sing();
    }
}
