import java.util.HashMap;
import java.util.Map;

public class delete2 {
    public static void main(String[] args) {
//        int x=1;
//        if(x<67){
//            System.out.println("Hello");
//        } else if (x<90) {
//            System.out.println("Greater");
//        } else if (x<7) {
//            System.out.println("HelloMadam");
//        }else{
//            System.out.println("(\"Now\")");
//        }
//        int[] arr={5,3,44,5,2,2,5};
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Insert elements
//        map.put("Amit", 101);
//        map.put("Rahul", 102);
//        map.put("Neha", 103);
//        map.put("Neha", 113);
//        System.out.println(map.containsKey("Neha"));
//        System.out.println(map.entrySet());
//        for(String item :map.keySet()){
//            System.out.println(item);
//        }

//        for(int item : arr){
//            if(!map.containsKey(item)){
//                map.put(item,1);
//            }else{
//                map.put(item,map.get(item)+1);
//            }
//        }
//        int max=-1,ans=-1;
//        for (Map.Entry<Integer, Integer> item:map.entrySet()){
//            if(max< item.getValue()){
//                max= item.getValue();
//                ans= item.getKey();
//            }
//        }
//        System.out.println(map);
//        System.out.println(ans);

        String s = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        for(char c : s.toCharArray()) {
//            if(map.get(c) == 1) {
//                System.out.println("First non-repeating: " + c);
//                return;
//            }
//        }
//        System.out.println("No unique character found");
        System.out.println(map.entrySet());

    }
}
