
class Student {
    // Fields (variables)
    String name;
    private int age;

    // Methods (functions)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Delete1 {
    public static void main(String[] args) {
        Student std1=new Student();
        std1.name="Shubham";
        std1.displayInfo();
    }
}
