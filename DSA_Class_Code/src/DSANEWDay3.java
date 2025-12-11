public class DSANEWDay3 {

   public static void merge(int[] arr,int left,int mid,int right){

       int n1=mid-left+1;
       int n2=right-mid;

       int[] lArr=new int[n1];
       int[] rArr=new int[n2];

       int i,j,k;
       for (i = 0; i <n1 ; i++) {
            lArr[i]=arr[left+i];
       }
       for (j = 0; j <n2 ; j++) {
            rArr[j]=arr[mid+j+1];
       }
       i=0;
       j=0;
       k=left;

       while (i<n1 && j<n2){
           if(lArr[i]<rArr[j])
               arr[k++]=lArr[i++];
           else
               arr[k++]=rArr[j++];
       }

       while (i<n1){
           arr[k++]=lArr[i++];
       }
       while (j<n2){
           arr[k++]=rArr[j++];
       }

   }

    public static void mergeSort(int[] arr,int left,int right){

        if(left>=right) return;
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);

        merge(arr,left,mid,right);
    }

    public static void main(String[] args) {

        int[] arr={7,4,2,9,1,3};

        for (int item: arr) System.out.print(item+" ");
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        for (int item: arr) System.out.print(item+" ");
    }
}
