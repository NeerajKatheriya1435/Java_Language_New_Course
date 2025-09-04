public class Day11 {
    public static void main(String[] args) {
//        int[][] arr1={{3,5,8},{2,7,4},{6,8,7}};
//        int[][] arr2={{2,5,7},{4,9,4},{8,9,7}};

//        int[][] arr3=new int[3][3];

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr3[i][j]=arr1[i][j]+arr2[i][j];
//            }
//        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <3; j++) {
//                System.out.print(arr3[i][j]+" ");
//            }
//            System.out.println();
//        }
        int[][] arr1={{3,5,8},{2,7,4},{6,8,7}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               arr1[j][i]=arr1[i][j];
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
