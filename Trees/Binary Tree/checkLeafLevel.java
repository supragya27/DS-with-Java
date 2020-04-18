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
    static int lh=-1;
    Node root;
    Tree()
    {
        root=null;
    }
    boolean isLeaf(Node root)
    {
        if(root.left==null&&root.right==null)
        return true;
        return false;
    }
    boolean checkLeafLevel(Node root,int ht,boolean res)
    {
        if(root==null)
        return res;
        if(res==true)
        {
            if(isLeaf(root))
            {
                if(lh==-1)
                {
                    lh=ht;
                }
                else
                {
                    if(ht!=lh)
                    return false;
                }
            }
            res=checkLeafLevel(root.left,ht+1,res);
            res=checkLeafLevel(root.right,ht+1,res);
        }
        return res;
    }
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
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
        tree.root.left.right.right = new Node(15); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        System.out.print(tree.checkLeafLevel(tree.root,1,true));
    }
    }