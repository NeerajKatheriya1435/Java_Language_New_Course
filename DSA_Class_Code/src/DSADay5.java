class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }

}

class linkedList{

    Node head=null;
    Node tail=null;

    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
//            head=tail=temp
            insertAtEnd(val);
            return;
        }
        temp.next=head;
        head=temp;
    }

    void insertAtIndex(int val,int pos){
        Node t1=new Node(val);
        Node temp=head;
        if(pos==0){
            insertAtHead(val);
            return;
        } else if (pos<0 || pos > size()) {
            System.out.println("Invalid Position");
            return;
        } else if (pos==size()) {
            insertAtEnd(val);
            return;
        }

        for (int i = 1; i <pos ; i++) {
            temp=temp.next;
        }
        t1.next=temp.next;
        temp.next=t1;
    }
    void valueAtindex(int pos){
        Node temp=head;
        if(pos<0 || pos>size()){
            System.out.println("Invalid Position");
            return;
        }
        if(pos==0){
            System.out.println(temp.data);
            return;
        }
        for (int i = 1; i <pos ; i++) {
            temp=temp.next;
        }
        System.out.println(temp.next.data);
    }
    void deleteAtIndex(int pos){
        Node temp=head;
        if(pos<0 || pos>size()){
            System.out.println("Invalid Position");
            return;
        }
//        if(pos==0){
//            System.out.println(temp.data);
//            return;
//        }
        for (int i = 1; i <pos ; i++) {
            temp=temp.next;
        }
        System.out.println("Hello delete");

        temp.next=temp.next.next;
        System.out.println("My name is" +temp.data);
    }

    void displayFunc(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    int size(){
        Node temp=head;
        int count=0;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        return count;
    }

}

public class DSADay5 {
    public static void main(String[] args) {
//        Node a=new Node(67);
//        System.out.println();
//        Node b=new Node(12);
//        Node c=new Node(17);
//        Node d=new Node(90);
//        a.next=b;
//        b.next=c;
//        c.next=d;
////        System.out.println(a.next.next.next.data);
//
//        Node temp=a;
////        for (int i = 1; i <=4 ; i++) {
////            System.out.print(temp.data+" ");
////            temp=temp.next;
////        }
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

        linkedList l1=new linkedList();
//        l1.insertAtEnd(56);
//        l1.insertAtEnd(78);
//        l1.insertAtEnd(78);
//        l1.insertAtHead(45);
//        l1.insertAtEnd(45);
//        l1.insertAtEnd(67);
//        l1.insertAtEnd(33);
//        l1.insertAtEnd(17);
//        l1.insertAtHead(45);
//        l1.insertAtIndex(99,2);
//        l1.insertAtIndex(12,1);

//        l1.insertAtIndex(90,0);
//        l1.insertAtIndex(789,-90);
        l1.insertAtEnd(67);
        l1.insertAtEnd(33);
        l1.insertAtEnd(17);
        l1.insertAtEnd(78);
        l1.insertAtEnd(56);
        l1.insertAtEnd(24);
//        l1.insertAtIndex(44,3);
        l1.displayFunc();

//        System.out.println("The head of array: "+l1.head.data);
//        System.out.println("The data of tail is: "+l1.tail.data);

//        System.out.println("The size pf array: "+l1.size());
//        l1.valueAtindex(2);
//        l1.valueAtindex(2);
        System.out.println("---------");
        l1.deleteAtIndex(2);
        l1.displayFunc();

    }
}
