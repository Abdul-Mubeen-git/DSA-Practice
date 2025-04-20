class Node {
    int data;
    Node left;
    Node right;

    Node (int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinarySearchTree{
    static Node root ;
    public static void main(String arg[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.Inseart(12);
        tree.Inseart(50);
        tree.Inseart(30);
        tree.Inseart(20);
        tree.Inseart(40);
        tree.Inseart(70);
        tree.Inseart(60);
        tree.Inseart(80);

        tree.Inorder();
    }

    public void Inorder() {
        InorderRec(root);
    }

    private void InorderRec(Node root) {
        if(root != null)
        {
            InorderRec(root.left);
            System.out.print(root.data+" ");
            InorderRec(root.right);
        }
    }

    public void Inseart(int data)
    {
        root = InseartRec(root, data);
    }
    private Node InseartRec(Node root , int data)
    {
        if (root == null)
        {
            root = new Node(data);
        }
        else if (data < root.data)
        {
            root.left = InseartRec(root.left, data);
        }
        else if (data > root.data)
        {
            root.right = InseartRec(root.right, data);
        }
        return root;  
    }
}