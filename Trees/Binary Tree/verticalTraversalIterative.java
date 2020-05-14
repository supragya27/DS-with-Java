import java.util.Scanner;
class Node
{
    int data; Node right,left;
    Node(int d)
    {
      data=d;right=left=null;
    }
}
class BinaryTree 
{
    
    static int l=0,r=0; Node root;
    BinaryTree()
    {
        root=null;
    }
    void minmax(Node root, int h)
    {
        if(root==null)   return;
        if(h<l)  l=h;
        if(h>r)  r=h;
        minmax(root.left,h-1);
        minmax(root.right,h+1);
    }
    void vertical (Node root, int line,int h)
    {
        if(root==null)   return;
        if(line==h)
        System.out.print(root.data+" ");
        vertical(root.left,line,h-1);
        vertical(root.right,line,h+1);
    }
    void vPrint(Node root)
    {
        minmax(root,0);
        for(int i=l;i<=r;i++)
        {
            vertical(root,i,0);
            System.out.println();
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
         BinaryTree tree = new BinaryTree(); 
   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.root.right.left.right = new Node(8); 
        tree.root.right.right.right = new Node(9);

        System.out.println("Vertical order traversal:");
        tree.vPrint(tree.root);

    }
    }