
class Parent{

    public String name;
    Parent(){
        System.out.println("I am Default Constructor");
    }

    Parent(String name){
        this.name=name;
        System.out.println("I am Parent Class constructor");
    }

    public void eat(){
        System.out.println("Eat the food");
    }
    public void teach(){
        System.out.println("I am teaching");
    }
}

class Child extends Parent{

//    Child(String name){
////        super(name);
//        System.out.println("I am Child class Constructor");
//    }
      Child(){
          System.out.println("I am Child class Constructor");
      }

    public void run(){
          super.eat();
        System.out.println(name+" I am running");

    }
}


public class Day22 {
    public static void main(String[] args) {

//        Parent p1=new Parent();
//        p1.eat();
//        Child c1=new Child();
//        Vandana c1=new Vandana();
//        c1.run();
//        c1.eat();
//        c1.teach();
//        c1.speak();

//        Parent p1=new Parent();
//        Child p1=new Child("Neeraj");
        Child p1=new Child();
        p1.run();

    }
}
