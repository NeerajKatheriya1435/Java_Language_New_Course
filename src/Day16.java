public class Day16 {
//    static void laugh(){
//        System.out.println("Smile please");
//    }
//    static void laugh(int num1){
//        System.out.println("Smile please number "+num1);
//    }
//    static void laugh(int num1 ,int num2){
//        System.out.println("Smile please number "+(num1+num2));
//    }
//    static void laugh(int num1 ,int num2,int num3){
//        System.out.println("Smile please number "+(num1+num2+num3));
//    }
    static void laugh(int ...args){
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }

        System.out.println("Smile please number "+(sum));
    }
    public static void main(String[] args) {

        laugh();
        laugh(6);
        laugh(6,9);
        laugh(6,9,9);
    }
}
