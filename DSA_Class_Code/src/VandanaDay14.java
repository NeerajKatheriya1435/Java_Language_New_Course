public class VandanaDay14 {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    public static class StackImp{
        // implementation using linked list

        Node head;
        void push(int data1){
            Node temp=new Node(data1);
            temp.next=head;
            head=temp;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int data= head.data;
            head=head.next;
            return data;
        }

        void display(){
            if(head==null){
                System.out.println("Stack is Empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        int size(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            Node temp=head;
            int count=0;
            while (temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }

        boolean isEmpty(){
            if(head==null) return true;
            else return false;
        }
    }
    public static void main(String[] args) {

        StackImp s1=new StackImp();
        s1.push(78);
        s1.push(56);
        s1.push(23);
        s1.push(12);

        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
//        s1.pop();
//        s1.display();
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
    }
}
