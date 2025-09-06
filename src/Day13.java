public class Day13 {
    public static void main(String[] args) {

        int[][]arr1={{2,4,7},{4,8,6},{1,3,8}};
        int[][] arr2=new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[j][i]=arr1[i][j];
            }
        }
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
