public class DSADay14 {
    public static class CicularQue{
        int front, rear, size;
        int[] arr;
        CicularQue(int n) {
            arr = new int[n];
            front = rear = -1;
            size = n;
        }

        void enque(int value){
            if((rear+1)%size==front){
                System.out.println("Queue is Full");
            }

            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=value;
        }

        void display(){
            if(front == -1) {
                System.out.println("Underflow");
                return;
            }
            for (int i = front; i <=rear ; i++) {
                System.out.println(arr[i]);
            }
        }

        int deque(){
            if(front == -1) {
                System.out.println("Underflow");
                return -1;
            }
            int val=arr[front];
            if(front == rear) front = rear = -1;
            else front = (front + 1) % size;
            return val;
        }
    }
    public static void main(String[] args) {

        CicularQue c1=new CicularQue(12);
        c1.enque(45);
        c1.enque(90);
        c1.enque(23);
        c1.enque(78);
        c1.enque(33);
        c1.deque();
        c1.deque();
        c1.deque();
        c1.deque();
        c1.deque();
        c1.deque();
        c1.display();
    }
}
