public class DSADay15 {

//    static int fact(int num){
//        if(num==1){
//            return 1;
//        }
//        return num*fact(num-1);
//    }

    static int fibb(int num){
        if(num==0){
            return 0;
        } else if (num<2) {
         return 1;
        }
        return fibb(num-2)+fibb(num-1);
    }
    public static void main(String[] args) {

//        System.out.println(fact(6));
        for (int i = 0; i < 150; i++) {
            System.out.print(fibb(i)+" ");
        }
    }
}
