public class delete4 {

    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] l1=new int[n1];
        int[] r1=new int[n2];
        int i,j,k;
        for (i = 0; i <n1 ; i++) l1[i]=arr[left+i];
        for (j = 0; j <n2 ; j++) r1[j]=arr[mid+1+j];

        i=0;
        j=0;
        k=left;
        while (i<n1 && j<n2){
            if(l1[i]<r1[j])
                arr[k++]=l1[i++];
            else
                arr[k++]=r1[j++];
        }
        while (i<n1){
            arr[k++]=l1[i++];
        }while (j<n2){
            arr[k++]=r1[j++];
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


        int[] arr1={4,7,3,2,7,0,6};
        int n= arr1.length;
        mergeSort(arr1,0, n-1);
        for (int item:arr1) System.out.println(item);
    }
}
