import java.util.LinkedList;
import java.util.Queue;

class NodeTree{
    int data;
    NodeTree left,right;

    NodeTree(int value){
        data=value;
        left=right=null;
    }
}

class BinaryTreeNew{

    public NodeTree root;

    BinaryTreeNew(int val){
        root=null;
    }

    public void insertCreateSample(){
        root=new NodeTree(1);
        root.left=new NodeTree(2);
        root.right=new NodeTree(3);
        root.left.left=new NodeTree(4);
        root.left.right=new NodeTree(5);
    }
    public void inorder(NodeTree node){
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public void preorder(NodeTree node){
        if(node==null) return;
        System.out.println(node.data);
        inorder(node.left);
        inorder(node.right);
    }

    public void postorder(NodeTree node){
        if(node==null) return;
        System.out.println(node.data);
        inorder(node.left);
        inorder(node.right);
    }

    public void levelOrder(NodeTree node){
        if(node==null) return;

        Queue<NodeTree> q=new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            NodeTree curr=q.poll();
            System.out.println(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

}

public class delete6 {

    public static void main(String[] args) {

    }
}
