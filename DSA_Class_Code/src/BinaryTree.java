import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
    class Node {
        int data;
        Node left, right;
        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    Node root;
    // Constructor
    BinaryTree() {
        root = null;
    }
    // 1. Insert nodes manually (simple tree)
    public void createSampleTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
    // 2. Inorder Traversal (Left, Root, Right)
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    // 3. Preorder Traversal (Root, Left, Right)
    public void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    // 4. Postorder Traversal (Left, Right, Root)
    public void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    // 5. Level Order Traversal (BFS)
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
    // 6. Search a value in tree
    public boolean search(Node node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
    // search in left or right subtree
        return search(node.left, key) || search(node.right, key);
    }
    // 7. Find height of tree
    public int height(Node node) {
        if (node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        return Math.max(l, r) + 1;
    }
    // 8. Count total nodes
    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createSampleTree();
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder(tree.root);
        System.out.println("\n\nSearch 5: " + tree.search(tree.root, 5));
        System.out.println("Height of tree: " + tree.height(tree.root));
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
    }
}