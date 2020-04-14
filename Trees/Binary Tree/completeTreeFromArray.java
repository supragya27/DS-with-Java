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
    Node construct(int arr[])
    {
        if(arr.length==0)
        return null;

        Queue<Node> q=new LinkedList<>();

        Node root=new Node(arr[0]);
        int s=arr.length,i=1;
        q.add(root);
        Node cN;

        while(i<s)
        {
             cN=q.peek();
             if(cN.left==null)
             {
                 cN.left=new Node(arr[i]);
                 q.add(cN.left);
             }
             else
             {
                 cN.right=new Node(arr[i]);
                 q.add(cN.right);
                 q.remove();
             }
             i++;
        }
        return root;


    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 2, 4, 3};
        Node root=tree.construct(arr);
        tree.preO(root);
    }
    }