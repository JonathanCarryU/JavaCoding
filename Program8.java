
import java.util.*;
import java.io.*;
public class Program8 {
    public static void main(String[] args) throws FileNotFoundException {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner input = new Scanner(new FileReader("BS_Nums3.txt"));
        while (input.hasNextLine()){
            tree.insert(Integer.parseInt(input.nextLine()));
        }


        System.out.print("Inorder traversal : ");
        tree.inorder();
        System.out.println();
        System.out.print("preorder traversal : ");
        tree.preorder();
        System.out.println();
        System.out.print("Postorder traversal : ");
        tree.postorder();
        System.out.println();
    }
}

class BinarySearchTree{
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int value) {
            key = value;
            left = right = null;
        }
    }

    Node root;
    BinarySearchTree() {
        root = null;
    }

    void insert(int element) {

        root = enter(root, element);
    }

    Node enter(Node root, int element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }
        if (element < root.key)
            root.left = enter(root.left, element);
        else if (element > root.key)
            root.right = enter(root.right, element);
        return root;
    }

    void inorder() {

        inorderRecursion(root);
    }

    void preorder() {

        preorderRecursion(root);
    }
    void postorder() {

        postorderRecursion(root);
    }
    void inorderRecursion(Node root) {
        if (root != null) {
            inorderRecursion(root.left);
            System.out.print(root.key+" ");
            inorderRecursion(root.right);
        }
    }

    void preorderRecursion(Node root) {
        if (root != null) {
            System.out.print(root.key+" ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }
    void postorderRecursion(Node root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.print(root.key+" ");
        }
    }

}
