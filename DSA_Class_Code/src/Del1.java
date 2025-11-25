public class Del1 {
    public static class Queue2{
        private int front,rear;
        private int size;
        private int[] arr;

        Queue2(int cap){
            arr=new int[cap];
            front=-1;
            rear=-1;
            size=0;
        }

        void enqueue(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=rear=0;
                arr[0]=val;
                size++;
                return;
            }
            arr[++rear]=val;
            size++;
        }

        int dequeu(){
            if(front>rear){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=arr[front];
            front++;
            return x;
        }

        void display(){
            if(front>rear){
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front; i <size ; i++) {
                System.out.println(arr[i]);
            }
        }

        int peek(){
            if(front>rear){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        // Implementation of queue

        Queue2 q1=new Queue2(4);
        q1.enqueue(23);
        q1.enqueue(45);
        q1.enqueue(29);
        q1.enqueue(90);
        q1.dequeu();
        q1.dequeu();
        q1.dequeu();
        q1.dequeu();
        q1.peek();
    }
}
