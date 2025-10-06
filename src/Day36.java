
class Vandana{

   public void meth1(){
       System.out.println("YYou are good");
   };
};

class V1 extends Vandana{

    @Override
//    @Deprecated
    public void meth1() {
        System.out.println("hello hii");
    }
}

public class Day36 {
    public static void main(String[] args) {
//        System.out.println("Hello");
        @SuppressWarnings("unchecked")
        V1 v1=new V1();

//        v1.meth1();
        v1.meth1();
    }
}
