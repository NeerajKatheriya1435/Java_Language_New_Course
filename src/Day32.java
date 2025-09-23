
class VandnaError extends Exception{

    VandnaError(String messgae){
        super(messgae);
    }
//    @Override
//    public String getMessage() {
//        return "Vandana is good girl";
//    }
}

public class Day32 {

    public static int khushi(){
        int age=15;
        try{
//
//            if(age<18){
//                throw new Exception("age is not valid");
//            }
//            System.out.println("You can drive the car");
        if(age>18)
            return 56;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }finally {
            System.out.println("Important line");
        }

        return 67;

    }
    public static void main(String[] args) {
//        int age=15;

//        try {
//            if(age<18){
//                throw new ArithmeticException("Value should be greater than 18");
//                throw new Exception("Error Found");
//                throw new VandanaException("Error Found");
//            }
//            System.out.println("You can drive the car");
//        } catch (Exception e) {
////            System.out.println("Arithmetic Exception Found");
////            System.out.println(e);
////            System.out.println(e.getMessage());
////            System.out.println(e.toString());
//        }


//        finally {
//            System.out.println("I am good boy");
//        }
        System.out.println(khushi());
    }
}
