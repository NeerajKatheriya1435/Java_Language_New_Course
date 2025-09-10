
class Khushi{
   public int id=420;
   public String name="Khushi Saxena";

//   public void details(){
//        System.out.println("Name is: "+name+ " and id is: "+id);
//    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String str1){
        if(str1==null)
            System.out.println("The name is required");
        else
            name=str1;
    }
}

public class Day19 {
    public static void main(String[] args) {
        Khushi obj1=new Khushi();
        Khushi obj2=new Khushi();
        Khushi ksh=new Khushi();

        // accessing the value
//        System.out.println(ksh.name);
//        System.out.println(ksh.id);

        // setting the value in name and age
//        obj1.name="Vandna Patel";
//        obj1.id=786;
//        obj1.details();

        // setting the value in name and age
//        obj2.name="Ajay";
//        obj2.id=120;
//        obj2.details();

//        System.out.println(ksh.name);  // not recommneded way to get the value
//        ksh.name="Vandana"; // not recommneded way to set the value
//        System.out.println(ksh.name);

//        ksh.name="Vandana";
//        ksh.setName("Vandana Kumari");
//        System.out.println(ksh.getName());

//        ksh.name=null;
        ksh.setName(null);
        System.out.println(ksh.getName());
    }
}
