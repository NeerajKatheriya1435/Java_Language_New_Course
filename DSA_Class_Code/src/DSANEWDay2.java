public class DSANEWDay2 {
    public static void insertionSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {

        int[] arr={14,6,17,8,9};
        insertionSort(arr);
        for (int item:arr) System.out.print(item+" ");
    }
}
