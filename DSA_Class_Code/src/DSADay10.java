import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DSADay10 {

//    public static void display(){
//
//    }
    public static class Queue1{
        int front,rear;
        int[] arr;

        Queue1(int size){
            arr=new int[size];
            front=0;
            rear=-1;
        }
        public void push(int data){
            if(rear== arr.length-1){
                System.out.println("Queue OverFlow");
            }arr[++rear]=data;
        }

        public void dequeue() {
        if(front > rear) {
            System.out.println("Underflow");
            return;
        }
        arr[front++]=0;
    }
        void display(){
            for (int i = 0; i <=rear ; i++) {
                System.out.println(arr[i]);
            }
        }
        public int peek(){
            if (front>rear){
                System.out.println(front);
                System.out.println(rear);
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
//        Queue<Integer> queue=new Queue<Integer>();
//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(67);
//        queue.add(76);
//        queue.add(90);
//        queue.add(12);
//        queue.add(88);
//        queue.remove();
//        queue.poll();

//        System.out.println(queue);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.contains(95));

//        for (int item:queue) {
//            System.out.println(item);
//        }
//        int max=Integer.MIN_VALUE;
//
//        for (int item:queue) {
//            if(max<item){
//                max=item;
//            }
//        }
//        System.out.println(max);

//        int mid = queue.size() / 2;
//        int idx = 0;
//
//        for(int x : queue) {
//            if(idx == mid) {
//                System.out.println("Middle = " + x);
//                break;
//            }
//            idx++;
//        }

//        int k = 2;
//        while(k-- > 0) {
//            queue.add(queue.poll());
//        }
//        System.out.println(queue);

        Queue1 a1= new Queue1(3);
        a1.push(78);
        a1.push(34);
        a1.push(45);
        a1.dequeue();
        a1.dequeue();
        a1.dequeue();
//        System.out.println(a1.dequeue());
        a1.display();
        System.out.println(a1.peek());
    }
}
