import java.util.LinkedList;

public class delete3 {

    public static class MyHasMAp<K,V>{
        public static final int DEFAULT_CAP=5;
        public static final float DEFAULT_LOAD_FACT=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initBucket(int size){
            buckets=new LinkedList[size];
            for (int i = 0; i < buckets.length ; i++) {
                buckets[i]=new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc=key.hashCode();
            return Math.abs(hc)% buckets.length;
        }
        private int searchInBucket(LinkedList<Node> ll, K key){
            for (int i = 0; i <ll.size() ; i++) {
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public MyHasMAp(){
            initBucket(DEFAULT_CAP);
        }

        public void put(K key,V val){
            int bi=HashFunc(key);
            LinkedList<Node> curentBucket=buckets[bi];
            int ei=searchInBucket(curentBucket,key);
            if(ei==-1){
                Node node=new Node(key,val);
                curentBucket.add(node);
                n++;
            }else{ // update case
                Node currNode=curentBucket.get(ei);
                currNode.value=val;
            }
        }

        public int size() {
            return n;
        }
        public V get(K key) {
            int bi=HashFunc(key);
            LinkedList<Node> curBuck=buckets[bi];
            int ei=searchInBucket(curBuck,key);
            if(ei!=-1){
                Node currentNode=curBuck.get(ei);
                return currentNode.value;
            }else{
                return null;
            }
        }
    }

    public static void main(String[] args) {
        MyHasMAp<String,String> myHasMAp=new MyHasMAp<>();

        myHasMAp.put("Name","Sumit");
        myHasMAp.put("College","SRMS");
        myHasMAp.put("College","SRMS23");
//        System.out.println(myHasMAp);
        System.out.println(myHasMAp.size());
        System.out.println(myHasMAp.get("College1"));
    }
}
