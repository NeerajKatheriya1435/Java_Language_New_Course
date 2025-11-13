import java.util.LinkedList;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;
    Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
//    void displayData(){
//        Node temp=
//    }
}

public class DSADAY7 {
    public static void main(String[] args) {

        Node1 a=new Node1(56);
        Node1 b=new Node1(78);
        Node1 c=new Node1(34);
        Node1 d=new Node1(23);
        Node1 e=new Node1(77);

        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println("---------------------");
        System.out.println(e.data);
        System.out.println(e.prev.data);
        System.out.println(e.prev.prev.data);
        System.out.println(e.prev.prev.prev.data);
        System.out.println(e.prev.prev.prev.prev.data);

//        LinkedList list1=new LinkedList();
//        list1.add(89);
//        System.out.println(list1.toString());
    }
}
