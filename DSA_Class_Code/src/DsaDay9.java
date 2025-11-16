import java.util.Stack;

public class DsaDay9 {

    public static Stack reverseStack(Stack s1) {
        Stack s2 = new Stack();
        System.out.println(s1.size());
        for (int i = 0; i < 6; i++) {
            s2.add(s1.pop());
        }
        System.out.println(s2);
        Stack s3 = new Stack();
        for (int i = 0; i < 6; i++) {
            s3.add(s2.pop());
        }
        System.out.println(s3);
        for (int i = 0; i < 6; i++) {
            s1.add(s3.pop());
//        }
            return s1;
        }
        return s2;
    }
        public static void main (String[]args){
            Stack s1 = new Stack();
            s1.add(4);
            s1.add(8);
            s1.add(2);
            s1.add(9);
            s1.add(0);
            // insert at top
            s1.add(1);
            System.out.println("Before " + s1);
            reverseStack(s1);
            System.out.println("After " + s1);
//        System.out.println(s1);
//
//        // access element at top
//        System.out.println(s1.peek());
//        System.out.println(s1);
//
//        System.out.println(s1.pop());
//        System.out.println(s1);
//        System.out.println(s1.empty());
//        System.out.println(s1.push(67));
//        System.out.println(s1);
//        System.out.println(s1.contains(56));
//        System.out.println(s1.reversed());

            // reverse the stack
        }






}
