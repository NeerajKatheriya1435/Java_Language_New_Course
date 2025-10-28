public class DSADay2 {
    public static void main(String[] args) {

        String str1="       Hello Sandeep       " ;
        String str2="Vandana Khushi Neeraj";
        String str3="Hello";
//        System.out.println(str1);
//        System.out.println(str1.charAt(3));
//        System.out.println(str1.charAt(3));
//
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.indexOf('e'));
//        System.out.println(str1.indexOf('e'));
//        System.out.println(str1.contains("Sandeep"));
//        System.out.println(str1);
//        System.out.println(str1.trim());
        String[] arr=str2.split(" ");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
        for (String item:arr)
            System.out.println(item);

    }
}

