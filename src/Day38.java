import java.util.ArrayList;

//class Box<T>{
//    private T val;
//
//    public T getVal() {
//        return val;
//    }
//
//    public void setVal(T val) {
//        this.val = val;
//    }
//}

 class Box<T1,T2>{
    private T1 val1;

     public T1 getVal1() {
         return val1;
     }

     public void setVal1(T1 val1) {
         this.val1 = val1;
     }

     public T2 getVal2() {
         return val2;
     }

     public void setVal2(T2 val2) {
         this.val2 = val2;
     }

     private T2 val2;

}

public class Day38 {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList=new ArrayList<>();
//
//        arrayList.add(45);
//        arrayList.add(15);
//        arrayList.add(25);
//        arrayList.add(35);
//        int num1=arrayList.get(2);
//        System.out.println(num1);
//        arrayList.add(65);
//        arrayList.add(55);
//        arrayList.add("Vanada");

//        System.out.println(arrayList.toString());
//        for (int i = 0; i <arrayList.size() ; i++) {
//            System.out.println(arrayList.get(i));
//        }
//        for(int item:arrayList){
//            System.out.println(item);
//        }
//        arrayList.forEach(item-> System.out.println(item));

//        ArrayList<String> arrayList1=new ArrayList<>();
//        arrayList1.add("Suman");
//        arrayList1.add("Vandana");
//        arrayList1.add("Khushi");
//        arrayList1.add("Khush");
//        arrayList1.add("Hai");
//
//        arrayList1.forEach(item-> System.out.println(item));

//        ArrayList arrayList= new ArrayList();
//        arrayList.add("Suman");
//        arrayList.add("Vanadanma");
//        arrayList.add(67.986);
//
//        int num1=(int) arrayList.get(1);
//        System.out.println(num1);
//        arrayList.forEach(item-> System.out.println(item));

//        Box<Integer> b1=new Box<>();
//
//        b1.setVal(78);
//        b1.setVal("suamn");
//        System.out.println(b1.getVal());

        Box<Integer,String> b1=new Box<>();

        b1.setVal1(56);
        b1.setVal2("Vandana");

        System.out.println(b1.getVal1());
        System.out.println(b1.getVal2());
    }
}
