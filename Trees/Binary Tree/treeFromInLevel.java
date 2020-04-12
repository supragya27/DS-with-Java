
import java.util.Arrays;

class Node
{
    int data;Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}

class Tree
{
    int getIndex(int d,int in[])
    {
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==d)
                return i;
        }
        return -1;
    }
    Node constructTree(int in[],int level[])
    {
        int n=0;
        int idx=getIndex(level[n],in);

        while(idx==-1)
        {
            idx=getIndex(level[++n],in);
        }

        Node root=new Node(in[idx]);
        n=0;
        if(idx==0)
            root.left=null;
        else
            root.left=constructTree(Arrays.copyOfRange(in,0,idx),Arrays.copyOfRange(level,++n,level.length));
        if(idx==in.length-1)
            root.right=null;
        else
            root.right=constructTree(Arrays.copyOfRange(in,idx+1,in.length),Arrays.copyOfRange(level,++n,level.length));
        return  root;
    }
    void inO(Node root)
    {
        if(root==null)
            return;
        inO(root.left);
        System.out.print(root.data+" ");
        inO(root.right);
    }
}
public class treeFromInLevel {
    public static void main(String[] args)
    {
        Tree t1=new Tree();
        int in[]={7,5,8,6,20,10};
        int level[]={20,5,10,7,6,8};
        Node root=t1.constructTree(in,level);
        t1.inO(root);


    }
}
