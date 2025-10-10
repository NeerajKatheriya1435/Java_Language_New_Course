
package khushi;
import vandana.day1;

class Boss extends day1{
    
    public void  mani(){
        System.out.println(num1);
        // System.out.println(num2);
        System.out.println(num3);
        // System.out.println(namestr);
    }
}

public class khushi1 {
    public static void main(String[] args) { 
        System.out.println("Hello I am khushi1");

        // day1 s1= new day1();
        // s1.accces1();
        // System.out.println(s1.num1);
        // System.out.println(s1.num2);
        // System.out.println(s1.num3);
        // System.out.println(s1.namestr);

        Boss b1=new Boss();
        b1.mani();
    }
}