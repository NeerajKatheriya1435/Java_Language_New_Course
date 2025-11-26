public class VandanaDay13 {

    public static class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    public static class LinkedList{

        Node head;
        Node tail;

        void push(int value1){
            Node temp=new Node(value1);
            if(head==null){
                head=temp;
                tail=temp;
                return;
            }
            tail.next=temp;
            tail=temp;
        }
//        int pop(){
//            if(head==null){
//                System.out.println("Stack is Empty");
//                return -1;
//            }
//            Node temp=head;
//            while (temp.next!=temp){
//                temp=temp.next;
//            }
//            int value = tail.data;
//            tail = temp;
//            tail.next = null;
//            return value;
//        }

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList l1= new LinkedList();
        l1.push(56);
        l1.push(89);
        l1.push(23);
        l1.push(13);

        l1.pop();
        l1.display();
    }
}
