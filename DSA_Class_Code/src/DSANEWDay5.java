import java.util.LinkedList;
import java.util.Queue;

public class DSANEWDay5 {

    public static class BinTree{
        public static class Node{
            int data;
            public Node left,right;
            Node(int data){
                this.data=data;
                left=right=null;
            }
        }
        public Node root;
        BinTree(){
            root=null;
        }

        public void MinTree(){
            root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
        }

        public void inorder(Node temp){
            if(temp!=null){
                inorder(temp.left);
                System.out.println(temp.data);
                inorder(temp.right);
            }
        }

        public void postorder(Node  temp){
            if(temp!=null){
                postorder(temp.left);
                postorder(temp.right);
                System.out.println(temp.data);
            }
        }
        public void preorder(Node  temp){
            if(temp!=null){
                System.out.println(temp.data);
                postorder(temp.left);
                postorder(temp.right);
            }
        }
        public void levelOrder(Node node) {
            if (node == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        public boolean search(Node node, int key) {
            if (node == null) return false;
            if (node.data == key) return true;
// search in left or right subtree
            return search(node.left, key) || search(node.right, key);
        }
        public int countNodes(Node node) {
            if (node == null) return 0;
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
    public static void main(String[] args) {

        BinTree b1=new BinTree();
        b1.MinTree();
        b1.inorder(b1.root);
        b1.levelOrder(b1.root);
        System.out.println(b1.search(b1.root,13));
        System.out.println(b1.countNodes(b1.root));
    }
}
