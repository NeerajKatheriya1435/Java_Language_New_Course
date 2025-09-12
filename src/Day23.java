////
//class Human{
//    public String name;
//
//    Human(){
//    }
//
//    Human(String name){
//        this.name=name;
//    }
//
//    public void eat(){
//        System.out.println("Human Can Eat");
//    }
//
//    public void DanceHuman(){
//        System.out.println("Human can dance");
//    }
//}
//
//class Teacher extends Human{
//    public  int age;
//
//    Teacher(String name,int age){
//        super(name);
//        this.age=age;
//    }
//
//    public void programmer(){
//        System.out.println("I am a program");
//    }
//
//    @Override
//    public void DanceHuman(){
//        System.out.println("Taecher can dance "+age);
//    }
//}
//
//public class Day23 {
//    public static void main(String[] args) {
//
////        Human newHuman=new Human("Vandana");
////        newHuman.DanceHuman();
////        Teacher newTaecher=new Teacher("Neeraj",34);
////        newTaecher.DanceHuman();
//
//        Human h1=new Human("Khushi");
//        h1.eat();
//        Teacher t1=new Teacher("Neeraj",34);
//        t1.programmer();
//
//        Human h2=new Teacher("Shubham",23);
////        h2.progammer();
//        h2.eat();
//        h2.DanceHuman();
//
//    }
//}
////class Employee {
////    String name;
////    double salary;
////    Employee(String name, double salary) {
////        this.name = name;
////        this.salary = salary;
////    }
////    void displayInfo() {
////        System.out.println("Employee: " + name + ", Salary: " + salary);
////    }
////}
////class Manager extends Employee {
////    String department;
////    Manager(String name, double salary, String department) {
////        super(name, salary);
////        this.department = department;
////    }
////    // Overriding the displayInfo method
////    @Override
////    void displayInfo() {
////        System.out.println("Manager: " + name + ", Salary: " + salary + " department: +" + department);
////    }
////}
////public class Day23 {
////    public static void main(String[] args) {
////        Employee e = new Employee("Neeraj", 50000);
////        Manager m = new Manager("Rahul", 70000, "IT");
////        e.displayInfo(); // Parent class method
////        m.displayInfo(); // Overridden method in Manager class
////    }
////}
