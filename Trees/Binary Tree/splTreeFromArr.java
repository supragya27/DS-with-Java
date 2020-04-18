import java.util.Scanner;
/*
The index of the array with value -1 is the root node, and the index which store the root index numbers are its children
*/
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
    int getIndex(int value,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        if(arr[i]==value)
        return i;
        return -1;
    }
    Node construct(int value,int arr[])
    {
       int idx=getIndex(value,arr);
       if(idx==-1)
       return null;
       
           Node root=new Node(idx);
           arr[idx]=-1;
           root.left=construct(idx,arr);
           root.right=construct(idx,arr);
           return root;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        int arr[]={1,5,5,2,2,-1,3};
        Node root=tree.construct(-1,arr);
        tree.preO(root);
    }
    }