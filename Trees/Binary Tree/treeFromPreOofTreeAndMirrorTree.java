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
    static int i=0;
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
    int getIndex(int arr[],int a)
    {
        for(int i=0;i<arr.length;i++)
        if(arr[i]==a)
        return i;
        return -1;
    }
    Node construct(int []pre,int[] preM)
    {
        Node root=new Node(pre[i]);
        int idx=getIndex(preM,pre[i++]);
        int children[]=Arrays.copyOfRange(preM,idx+1,preM.length);
        if(children.length>1)
        {
            int lci=getIndex(preM,pre[i]);
            int rci=idx+1;
        root.left=construct(pre,Arrays.copyOfRange(preM,lci,preM.length));
        root.right=construct(pre,Arrays.copyOfRange(preM,rci,lci));
        }
        return root;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        
        int pre[]={1,2,4,5,3,6,8,9,7};
        int preM[]={1,3,7,6,9,8,2,5,4};
        Node root=tree.construct(pre,preM);
        tree.preO(root);
    }
    }