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
    Node root;
    static int[][] ancsMat;
    Tree()
    {
        root=null;
    }
    int [][] consMat(Node root,int n)
    {
          ancsMat=new int[n][n];
          construct(root,new LinkedList<Integer>());
          return ancsMat;
    }
    void construct(Node root,LinkedList<Integer> l)
    {
        if(root==null)
        return;
        LinkedList <Integer> li=new LinkedList<>(l);

        for(int i=0;i<li.size();i++)
        {
            ancsMat[li.get(i)][root.data-1]=1;
        }
        li.add(root.data-1);
        construct(root.left,li);
        construct(root.right,li);
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
        tree.root.left.right.left = new Node(8); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        int arr[][]=tree.consMat(tree.root,8);

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    }