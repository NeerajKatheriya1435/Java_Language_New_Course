public class Del2 {
    public static class Node{
        Node next;
        int data;

        Node(int val){
            data=val;
            next=null;
        }
    }
    public static class QueueLink{
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

        int deque(){
            if(head==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            int temp=head.data;
            head=head.next;
            return temp;
        }

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }
    public static void main(String[] args) {

        QueueLink queueLink=new QueueLink();
        queueLink.enque(67);
        queueLink.enque(12);
        queueLink.enque(78);
        queueLink.enque(38);
//        queueLink.enque(56);
        queueLink.deque();
        queueLink.deque();
        queueLink.deque();
        queueLink.display();
//        System.out.println(queueLink.head.next);
    }
}
