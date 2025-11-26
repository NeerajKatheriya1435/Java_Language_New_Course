public class delete1 {
    public static class Cqueue {
//        int front=-1;
//        int rear=-1;
//        int size=0;
//        int[] arr;
//
//        Cqueue(int cap){
//            arr=new int[cap];
//        }
//
//        void enque(int val){
//            if(size== arr.length){
//                System.out.println("Queue is full");
//                return;
//            }
//            else if(size==0){
//                rear=front=0;
//                arr[0]=val;
//            } else if (rear< arr.length-1) {
//                arr[++rear]=val;
//            } else if (rear== arr.length-1) {
//                arr[0]=val;
//                rear=0;
//            }
//            size++;
//        }
//        int deque(){
//            if(size==0){
//                System.out.println("Queue is Empty");
//                return -1;
//            } else{
//                int val=arr[front];
//                if(front== arr.length-1) front=0;
//                else front++;
//                size--;
//                return val;
//            }
//        }
//
//        void display() {
//            if(size==0){
//                System.out.println("Queue is Empty");
//                return;
//            } else{
//                if(front<=rear){
//                    for (int i = front; i <=rear ; i++) {
//                        System.out.println(arr[i]);
//                    }
//                }
//                else{
//                    for (int i = front; i < arr.length ; i++) {
//                        System.out.println(arr[i]);
//                    }
//                    for (int i = 0; i <=rear ; i++) {
//                        System.out.println(arr[i]);
//                    }
//                }
//            }
//        }
        int front, rear, size;
        int[] arr;
        Cqueue(int n) {
            arr = new int[n];
            front = rear = -1;
            size = n;
        }
        void enqueue(int x) {
            if((rear + 1) % size == front) {
                System.out.println("Overflow");
                return;
            }
            if(front == -1) front = 0;
            rear = (rear + 1) % size;
            arr[rear] = x;
        }
        int dequeue() {
            if(front == -1) {
                System.out.println("Underflow");
                return -1;
            }
            int val = arr[front];
            if(front == rear) front = rear = -1;
            else front = (front + 1) % size;
            return val;
        }
        int peek() {
            return (front == -1) ? -1 : arr[front];
        }
        boolean isEmpty() {
            return front == -1;
        }
        void display() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");

            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;          // circular increment
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Cqueue c1= new Cqueue(4);
        c1.enqueue(67);
        c1.enqueue(12);
        c1.enqueue(34);
        c1.display();
    }
}
