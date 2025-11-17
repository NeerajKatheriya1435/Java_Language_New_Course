import java.util.Stack;

class ArrayStack{
    int[] arr;
    int top;

    ArrayStack(int size){
        arr=new int[size];
        top=0;
    }
    public void push(int element){
        if(top== arr.length){
            System.out.println("Stack OverFlow");
            return;
        }
        arr[top]=element;
        top++;
    }

    public int pop(){

        if(top==0){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int topElem=arr[top-1];
//        System.out.println(topElem);
        arr[top-1]=0;
        top--;
        return topElem;
    }

    public void display(){
        for (int i = 0; i <top ; i++) {
            System.out.println(arr[i]);
        }
    }

    public void isEmpty(){
        if(top==0){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Not Empty");
        }
    }

}

public class Day10 {
    public static void main(String[] args) {

//        String str1="Khushi";
//        Stack <Character> s1=new Stack<>();

//        for (int i = 0; i <str1.length() ; i++) {
//            s1.push(str1.charAt(i));
//        }

//        String rev="";
//        for (int i = 0; i <str1.length() ; i++) {
//            rev+=s1.pop();
//        }
//        while (!s1.isEmpty()){
//            rev+=s1.pop();
//        }
//        System.out.println(rev);

//        Stack <Integer> s1=new Stack<Integer>();
//        Stack <Integer> s2=new Stack<Integer>();
//        s1.push(45);
//        s1.push(34);
//        s1.push(17);
//        s1.push(23);
//        int count=0;
//        int min=Integer.MAX_VALUE;
//        while (!s1.empty()){
//            int top=s1.pop();
////            if(min>top){
////                min=top;
////            }
//            count++;
//        }
//        System.out.println(min);
//        System.out.println(count);
//        s2.addAll(s1);
//        s2.addAll(s1);
//        System.out.println(s2);

        ArrayStack arrayStack=new ArrayStack(13);
        arrayStack.push(34);
//        arrayStack.push(38);
//        arrayStack.push(23);
//        arrayStack.push(12);
////        arrayStack.display();
//        arrayStack.pop();
//        arrayStack.pop();
//        arrayStack.display();
        arrayStack.isEmpty();
    }
}
