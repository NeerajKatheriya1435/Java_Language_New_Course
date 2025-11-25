import com.sun.source.tree.BreakTree;

public class DSADay12 {

    public static class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }

    public static class Queue{

        Node head;
        Node tail;

        void enque(int value){
            Node temp=new Node(value);
            if(head==null){
                head=temp;
                tail=temp;
                return;
            }
            tail.next=temp;
            tail=temp;
        }

        void deque(){
            if(head==null){
                System.out.println("Queue is Empty");
                return;
            }
            head=head.next;
        }

        void display(){
            if(head==null){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        int peekVal(){
            if(head==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q1=new Queue();
        q1.enque(45);
        q1.enque(22);
        q1.enque(42);
        q1.enque(90);
//        q1.deque();
//        q1.deque();
//        q1.deque();
//        q1.deque();

//        q1.display();
        System.out.println(q1.peekVal());
    }
}
