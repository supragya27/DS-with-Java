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
    boolean isLeaf(Node root)
    {
        if((root.left==null)&&(root.right==null))
        return true;
        return false;
    }
    boolean checkSumTree(Node root)
    {
         if(isLeaf(root))
         return true;
         int ls=0,rs=0;
         boolean res=true;
         if(root.left!=null)
         {
             if(isLeaf(root.left))
             ls+=root.left.data;
             else
             ls+=(root.left.data*2);
         }
         if(root.right!=null)
         {
             if(isLeaf(root.right))
             rs+=root.right.data;
             else
             rs+=(root.right.data*2);
         }

         if(ls+rs!=root.data)
         res=false;

         if(res==true)
         if(root.left!=null)
         res=checkSumTree(root.left);
         if(res==true)
         if(root.right!=null)
         res=checkSumTree(root.right);

         return res;

    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        tree.root = new Node(21); 
        tree.root.left = new Node(3); 
        tree.root.right = new Node(7); 
        tree.root.left.left = new Node(2); 
        tree.root.left.right = new Node(1); 
        tree.root.right.left = new Node(4); 
        tree.root.right.right = new Node(3);
        System.out.println(tree.checkSumTree(tree.root));
    }
    }