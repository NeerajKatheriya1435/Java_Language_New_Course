// package khushi.gym.trainer;

import vandana.day2;

class Sutra{
    private int num2=48;
    protected int num3=95;
    String namestr="Shivam";
    public int num1=78;

    void accces1(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(namestr);
    }

}

class Boss extends Sutra{
        void accces1(){
        System.out.println(num1);
        // System.out.println(num2);
        System.out.println(num3);
        System.out.println(namestr);
    }
}

public class UseFile {
    public static void main(String[] args) { 
        System.out.println("Hello I am khushi1 Gym1 trainer2");

        // day2 d1=new day2();
        // d1.sing();
        // s1.accces1();

        // System.out.println(s1.num1);
        // System.out.println(s1.num2);
        // System.out.println(s1.num3);
        // System.out.println(s1.namestr);

        Boss s1= new Boss();
        s1.accces1();

    }

    

}