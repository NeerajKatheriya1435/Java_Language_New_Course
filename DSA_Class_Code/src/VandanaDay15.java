public class VandanaDay15 {
    public static class Queue{

        int rear,front;
        int[] arr;
        int size=0;

        Queue(int cap){
            arr=new int[cap];
            rear=-1;
            front=0;

        }

        void enque(int val){
            if(rear==arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear]=val;
            size++;

        }

        int deque(){
            if(rear+1==front){
                System.out.println("Queue is Empty");
                return -1;
            }
            int data=arr[front];
            front++;
            size--;

            return data;
        }

        void display(){
            if(rear==-1){
                System.out.println("Queue is Empty");
                return;
            }
            for (int i = front; i <=rear ; i++) {
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {

        Queue q1=new Queue(10);
        q1.enque(45);
        q1.enque(34);
        q1.enque(12);
//        q1.enque(90);
//        q1.enque(23);
//        q1.enque(45);

//        q1.deque();
//        q1.deque();
//        q1.deque();
//        q1.deque();
//        q1.deque();
//        q1.deque();
//        q1.deque();

        q1.display();
        System.out.println("The Element in Queue is: "+q1.size);
    }
}
