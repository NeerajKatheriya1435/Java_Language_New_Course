import java.util.HashMap;
import java.util.LinkedList;

public class DSADay17 {



    public static class MYHashMAp<K,V>{

        public static final int DEFEAULT_SIZE=5;
        private class Node{
            K key;
            V val;

            Node(K key,V val){
                this.key=key;
                this.val=val;
            }
        }
        int n=0;
        LinkedList<Node>[] myBucket;

        public void initBucket(int n){
            myBucket=new LinkedList[n];
            for (int i = 0; i < myBucket.length ; i++) {
                myBucket[i]=new LinkedList<>();
            }
        }

        MYHashMAp(){
            initBucket(DEFEAULT_SIZE);
        }
        private int hashFunc(K key){
            int hashVal=key.hashCode();
            return Math.abs(hashVal)% myBucket.length;
        }
        private int searchInBucket(LinkedList<Node> bi,K key){
            for (int i = 0; i <bi.size() ; i++) {
                if(bi.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public void put(K mykey, V value){
            int hc=hashFunc(mykey);
            LinkedList<Node> bi=myBucket[hc];
            int ei=searchInBucket(bi,mykey);
            if(ei==-1){
                Node currentNode=new Node(mykey,value);
                bi.add(currentNode);
                n++;
            }else{
                Node currNode=bi.get(ei);
                currNode.val=value;
            }
        }

        public void get(K key){
            int hc=hashFunc(key);
            LinkedList<Node> bi=myBucket[hc];
            int ei=searchInBucket(bi,key);
//            System.out.println("hello");
            if(ei!=-1){
                Node currNode=bi.get(ei);
                System.out.println(currNode.val);
                return;
            }else{
                System.out.println("Key Not Found");
                return;
            }
        }
    }
    public static void main(String[] args) {

        MYHashMAp<String,Integer> m1=new MYHashMAp<>();

        m1.put("Akash",78);
        m1.put("Khushi",18);
        m1.put("Vandana",56);

        m1.get("Khushi");
        m1.get("Vandana");

    }
}
