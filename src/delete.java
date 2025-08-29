import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the even number");
        int number = sc.nextInt();
        for (int i = 0; i < 2 * number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//    for(int i=0;i)

