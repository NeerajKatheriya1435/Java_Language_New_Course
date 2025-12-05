public class DSANEWDay1 {

//    public static void bubbleSort(int[] arr){
//        int size= arr.length;
//        for (int i = 0; i <(size-1) ; i++) {
//            for (int j = 0; j <(size-i-1) ; j++) {
//               if(arr[j]>arr[j+1]){
//                   int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//               }
//            }
//        }
//    }

    public static void SelectionSort(int[] arr){
        int size= arr.length;
        for (int i = 0; i <size-1; i++) {
            int min_ind=i;
            for (int j = i+1; j <size; j++) {
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {

        int[] arr={4,7,9,2,1};
//        bubbleSort(arr);
        SelectionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
