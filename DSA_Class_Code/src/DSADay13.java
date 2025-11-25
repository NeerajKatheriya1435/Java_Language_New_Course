public class DSADay13 {
    public static class CQueue {
        int front, rear;
        int[] arr;
        int size = 0;

        CQueue(int cap) {
            arr = new int[cap];
            front = rear = -1;
        }

        void enque(int elem) {
            if (size == arr.length) {
                System.out.println("Queue is Full");
                return;
            } else if (size == 0) {
                front = rear = 0;
                arr[rear] = elem;
                return;
            } else if (rear < arr.length) {
                arr[++rear] = elem;
                size++;
            }
        }

//        int deque(){
//
//        }

        void display() {

            if (front < size) {
                for (int i = front; i < size; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    for (int i = front; i < size; i++) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        CQueue cQueue=new CQueue(5);

        cQueue.enque(34);
        cQueue.enque(12);
        cQueue.enque(23);
        cQueue.enque(78);
        cQueue.enque(19);
//        cQueue.deque();
//        cQueue.deque();
        cQueue.display();

    }
}
