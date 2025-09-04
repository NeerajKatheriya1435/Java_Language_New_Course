import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        int[] arr={4,6,8};
        // 6 7 9
        // 6 4 9
        // 4 8 9
//        int[][] arrMatrix={{1,2,3},{3,4,5},{5, 6, 7}};
        int [][] arrMatrix=new int[3][3];
//        System.out.println(arrMatrix[0][0]);
//        System.out.println(arrMatrix[1][1]);
//        System.out.println(arrMatrix[2][0]);
        Scanner sc=new Scanner(System.in);

        // giving input to a two array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the value at index: "+i+","+j);
                arrMatrix[i][j]=sc.nextInt();
            }
        }

        // acceing the element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrMatrix[i][j]+" ");
//           arrMatrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
}
