public class Delete123 {
    public static void main(String[] args) {

        int num1= 763;
        int reverseNum=0;
        while (num1>0){
            int lastDigit=num1%10;
            reverseNum=(reverseNum*10)+lastDigit;
            num1=num1/10;
        }
        System.out.println("The revered Num is: "+reverseNum);
    }
}
