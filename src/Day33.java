import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Day33 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>(5);

        arrayList.add(67);
        arrayList.add(56);
        arrayList.addFirst(90);
        arrayList.add(1,78);
//        System.out.println(arrayList.size());

//        arrayList.add("Vandana");
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

//        arrayList.set(3,32);
//    arrayList.clear();
//        System.out.println(arrayList.contains(516));
//        System.out.println(arrayList.indexOf(516));
//        System.out.println(arrayList.toString());
//        for(int item:arrayList){
//            System.out.println(item);
//        }
//        https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
//        ArrayList<Integer> vandanArray=new ArrayList<>(arrayList);
//        System.out.println(vandanArray.toString());
//        LinkedList linkedList=new LinkedList();
//        linkedList.add(78);
//        linkedList.add(79);
//        linkedList.add(56);
//        linkedList.add(99);
//        linkedList.poll();
//
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.toString());

        ArrayDeque<String> arrayDeque=new ArrayDeque<>();

        arrayDeque.add("Vandana");
        arrayDeque.add("Khushi");
        arrayDeque.addFirst("FisrtV");
        arrayDeque.addLast("LastV");
        arrayDeque.offerFirst("Neeraj");
        arrayDeque.addFirst("Suman");

//        System.out.println(arrayDeque.addFirst("Suman"));
        System.out.println(arrayDeque.offerFirst("Suman"));
        System.out.println(arrayDeque.toString());
    }
}
