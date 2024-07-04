class Node{
    int data;
    Node left;
    Node right;
     
    public Node(int data)
    {
        this.data=data;
    }
}
class Binary{
    Node root;

    public void insert(int data)
    {
        root = insertrec(root,data);
    }
    public Node insertrec(Node root,int data)
    {
        if ( root == null)
        {
            root = new Node(data);
        }
        else if( data < root.data)
        {
            root.left= insertrec(root.left, data);
        }
        else if( data > root.data)
        {
            root.right = insertrec(root.right, data);
        }
        return root;
    }
// traversing methods
//1. Inorder-left , root, right
//2. preorder - root, left, right
// 3.postorder - left, right, root


// inorder
/*

    public void inorder()
    {
        inorderRec(root);
    }
    public void inorderRec(Node root)
    {
        if( root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data+ " ");
            inorderRec(root.right);
        }
    }*/

    //preorder
    public void preorder()
    {
        preorderRec(root);
    }
    public void preorderRec(Node root)
    {
        if( root != null)
        {
            System.out.print(root.data+ " ");
            preorderRec(root.left);         
            preorderRec(root.right);
        }
    }

    
}

public class BinarySearchTree{
    public static void main(String[] args)
    {
        Binary tree=new Binary();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        

       // tree.inorder();
       tree.preorder();

    }
}