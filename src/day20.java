
class Khushi1{
    private int id=420;
    private String name="Khushi Saxena";

    //   public void details(){
//        System.out.println("Name is: "+name+ " and id is: "+id);
//    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void Details(){
        System.out.println(name);
    }
};

public class day20 {
    public static void main(String[] args) {
        Khushi1 obj1=new Khushi1();
//        System.out.println(obj1.id);
//        obj1.name="Shivam12";
//        System.out.println(obj1.name);
        obj1.Details();
    }
}
