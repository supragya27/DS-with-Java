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
        tNode cN=root, ncN=new tNode(root.data);
        mirror2(cN,ncN,2);
        return ncN;
    }   
    void mirror2(tNode cN,tNode ncN, int d)
    {
        if(cN==null)
        return;
        if(d==0)
        {
            ncN.rchild=new tNode(cN.data);
            ncN=ncN.rchild;
        }
        else if(d==1)
        {
            ncN.lchild=new tNode(cN.data);
            ncN=ncN.lchild;
        }
        mirror2(cN.lchild,ncN,0);
        mirror2(cN.rchild,ncN,1);
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