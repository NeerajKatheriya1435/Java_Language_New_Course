
package gudda;
import gudiya.Day4;

import javax.xml.namespace.QName;

class Teacher extends Day4{

    public void meth(){
        System.out.println(num1);
        System.out.println(num3);
//        System.out.println(name);
//        System.out.println(num2);
    }
}

public class Shubham {
    public static void main(String[] args) {
        System.out.println("********TechVision*******");

//        Day4 d4=new Day4();
//        System.out.println(d4.num1);
//        System.out.println(d4.num2);
//        System.out.println(d4.num3);
//        System.out.println(d4.name);

        Teacher t1 = new Teacher();
        t1.meth();

    }
}
