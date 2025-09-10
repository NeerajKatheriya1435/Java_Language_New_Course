public class Day18 {

//    static  int recFunc(int n){
//        if(n==0||n==1){
//            return  1;
//        }else{
//            return n*recFunc(n-1);
//        }
//    }
    static  int fibb(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else{
            return fibb(n-2)+fibb(n-1);
        }
    }
    public static void main(String[] args) {
//        System.out.println(recFunc(5));
//        System.out.println(recFunc(6));
        int n=12;
        for (int i = 0; i < n; i++) {
            System.out.println(fibb(i));
        }
    }
}
