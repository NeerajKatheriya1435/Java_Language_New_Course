public class VandanaDay12 {
    public static class Stack{
        int top;
//        int size;
        int arr[];

        Stack(int cap){
            arr=new int[cap];
            top=0;
        }
        void push(int val){
            if(top== arr.length){
                System.out.println("Stack is Full");
                return;
            }
            arr[top]=val;
            top++;
        }

        int pop(){
            if(top==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int last=arr[top];
            top--;
            return last;
        }

        void display(){
            if(top==0){
                System.out.println("Stack is Empty");
                return;
            }
            for (int i = 0; i <top ; i++) {
                System.out.println(arr[i]);
            }
        }

        int size(){
            return top;
        }
        boolean isEmpty(){
            if(top==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {


        Stack s1= new Stack(5);
        s1.push(56);
        s1.push(67);
        s1.push(23);
        s1.pop();
        s1.pop();
        s1.pop();
//        s1.pop();
        s1.display();
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
    }
}
