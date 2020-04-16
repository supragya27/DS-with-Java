import java.util.*;
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
    static int cs=0,ucs=0;
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
    void calcCover(Node root)
    {
        if(root==null)
        return;

        Stack<Node> s=new Stack<>();
        Node cN=root;

        while((!s.isEmpty())||cN!=null)
        {
             while(cN!=null)
             {
                 s.push(cN);
                 cs+=cN.data;
                 cN=cN.left;
             }
             cN=s.pop();
             cN=cN.right;
        }
    }
    boolean check(Node root)
    {
        if(root==null)
        return false;
        ucs+=root.data;
        Node cN=root.left;
        while(cN!=null)
        {
            if((cN.left==null)&&(cN.right!=null))
            {
                ucs+=cN.data;
                cN=cN.right;
            }
            else
            {
                calcCover(cN.right);
                ucs+=cN.data;
                cN=cN.left;
            }
        }
        cN=root.right;
        while(cN!=null)
        {
            if((cN.right==null)&&(cN.left!=null))
            {
                ucs+=cN.data;
                cN=cN.left;
            }
            else
            {
                calcCover(cN.left);
                ucs+=cN.data;
                cN=cN.right;
            }
        }
        if(cs==ucs)
        return true;
        return false;


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
        System.out.println(tree.check(tree.root));
    }
    }