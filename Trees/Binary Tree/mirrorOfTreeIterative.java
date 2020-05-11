import java.util.*;
class tNode
{
    int data; tNode lchild,rchild;
    tNode(int d)
    {
        data=d;
        lchild=rchild=null;
    }
}
class Tree
{
    tNode root;
    Tree()
    {
        root=null;
    }
    tNode mirror()
    {
        tNode cN=root,ncN=null,nroot=null;
        Stack<tNode> s=new Stack<>();
        Stack<tNode> ns=new Stack<>();
        while((!s.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                if(nroot==null)
                {
                    ncN=new tNode(cN.data);
                    nroot=ncN; s.push(cN); ns.push(ncN);
                    cN=cN.lchild;
                    if(cN!=null)
                    {
                        ncN.rchild=new tNode(cN.data);
                        ncN=ncN.rchild;
                    }
                }
                else
                {
                    s.push(cN);   ns.push(ncN);
                    cN=cN.lchild;
                    if(cN!=null)
                    {
                        ncN.rchild=new tNode(cN.data);
                        ncN=ncN.rchild;
                    }
                }
            }
            cN=s.pop();  ncN=ns.pop();
            cN=cN.rchild;
            if(cN!=null)
            {
                ncN.lchild=new tNode(cN.data);
                ncN=ncN.lchild;
                s.push(cN); ns.push(ncN);
            }
        }
        return nroot;
    }   
    void preO(tNode root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.lchild);
        preO(root.rchild);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Tree t1=new Tree();
        t1.root=new tNode(1);
        t1.root.lchild=new tNode(2);
        t1.root.rchild=new tNode(3);
        t1.root.lchild.lchild=new tNode(4);
        t1.root.lchild.rchild=new tNode(5);
        t1.root.rchild.lchild=new tNode(6);
        t1.root.rchild.rchild=new tNode(7);
        t1.root.rchild.rchild.rchild=new tNode(9);
        t1.root.rchild.rchild.rchild.lchild=new tNode(11);
        t1.root.rchild.rchild.rchild.lchild.rchild=new tNode(13);
        t1.root.lchild.lchild.rchild=new tNode(8);
        t1.root.lchild.lchild.rchild.lchild=new tNode(10);
        t1.root.lchild.lchild.rchild.lchild.lchild=new tNode(12);
        tNode neww=t1.mirror();
        t1.preO(t1.root);
        System.out.println();
        t1.preO(neww);

    }
    }