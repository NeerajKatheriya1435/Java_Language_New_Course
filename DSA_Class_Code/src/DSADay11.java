public class DSADay11 {
    static class circularQueue{

        int front,rear;
        int size;
        int[] arr;

        circularQueue(int cap){
            arr=new int[cap];
            size=0;
            front=rear=-1;
        }

        void enqueData(int val){

            int length=arr.length;
//            System.out.println(length);
//            System.out.println(rear);
            arr[(++rear)%length]=val;
            size++;
        }

        void display(){
            for (int i=0;i<size;i++ ) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

        circularQueue c1=new circularQueue(5);
        c1.enqueData(78);
        c1.enqueData(34);
        c1.enqueData(23);
        c1.enqueData(45);
        c1.enqueData(22);
        c1.enqueData(3333);

        c1.display();
    }
}
