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
            temp.next=head;
            head=temp;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            Node temp=head;
            int value = temp.data;
            head = temp.next;
            return value;
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

        LinkedList l1= new LinkedList();
        l1.push(78);
        l1.push(45);
        l1.push(490);

        l1.pop();
        l1.pop();
        l1.pop();
        l1.pop();
        l1.display();
    }
}
