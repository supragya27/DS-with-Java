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
    int getIndex(int[] in)
    {
        int max=0;
        for(int i=1;i<in.length;i++)
        if(in[i]>in[max])
        max=i;
        return max;
    }
    Node construct(int in[])
    {
        if(in.length==0)
        return null;

        int idx=getIndex(in);
        Node root=new Node(in[idx]);
        if(idx!=0)
        root.left=construct(Arrays.copyOfRange(in,0,idx));
        if(idx!=(in.length-1))
        root.right=construct(Arrays.copyOfRange(in,idx+1,in.length));
        return root;
        
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
        int in[]={27,21,23,40,20,50,29,15,5,25,10};
        Node root=tree.construct(in);
        tree.preO(root);
    }
    }