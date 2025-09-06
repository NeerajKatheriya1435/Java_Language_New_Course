import java.lang.reflect.Array;
import java.util.Arrays;

public class Day14 {
    public static void main(String[] args) {
//        int[] arr1={6,8,3,5};
//        int[] arr2={6,8,13,5};

//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        int index=Arrays.binarySearch(arr1,28);
//        System.out.println(index);
//        System.out.println(Arrays.equals(arr1,arr2));
//        int[] arr123=new int[5];
//        Arrays.fill(arr123,20);
//        System.out.println(Arrays.toString(arr123));
        int[] arr={4,7,2,9,10};
//        int []copy=Arrays.copyOf(arr,13);
        int []copy=Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(copy));

    }
}
