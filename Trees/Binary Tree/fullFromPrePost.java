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
    static int i=0;
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }
    int getIndex(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        if(arr[i]==n)
        return i;
        return -1;
    }
    Node construct(int pre[],int post[])
    {
        Node root=new Node(pre[i]);
        int idx=getIndex(post,pre[i++]);

        if(idx>1)
        {
            int lci=getIndex(post,pre[i]);
            int rci=idx-1;
            root.left=construct(pre,Arrays.copyOfRange(post,0,lci+1));
            root.right=construct(pre,Arrays.copyOfRange(post,lci+1,post.length));
        }
        return root;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        int pre[]={1,2,4,5,8,9,3,6,7};
        int post[]={4,8,9,5,2,6,7,3,1};
        Node root=tree.construct(pre,post);
        tree.preO(root);
    }
    }