import java.util.Scanner;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class Tree
{
    Node root;
    Tree()
    {
        root=null;
    }
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }

    boolean isFull(Node root)
    {
        if(root==null)
        return true;

if((root.left==null&&root.right!=null)||(root.left!=null&&root.right==null))
        return false;
        
        boolean res=isFull(root.left);
        if(res==false)
        return res;

        return isFull(root.right);

    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 

        System.out.println(tree.isFull(tree.root));
    }
    }