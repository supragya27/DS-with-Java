import java.util.*;
class tNode{
    int data;tNode lchild,rchild;
    tNode(int d)
    {
        data=d;
        lchild=rchild=null;
    }
}

class Tree{
    tNode root;
    void inO(tNode root)
    {
        if(root==null)
        return;
        inO(root.lchild);
        System.out.print(root.data+" ");
        inO(root.rchild);
    }
    void dNode(int key,tNode root)
    {
        tNode cN=root,pN=root;
        Stack<tNode> s=new Stack<>();
        m:
        while((!s.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                if(cN.data==key)
                {
                break m;
                }
                s.push(cN);
                cN=cN.lchild;
            }
            cN=s.pop();  pN=cN;
            cN=cN.rchild;
        }
                 //   System.out.println(cN.data);
        if(cN.lchild==null&&cN.rchild==null)
        {
            if(pN.rchild==cN)
            pN.rchild=null;
            else
            {
                pN=s.pop();
                pN.lchild=null;
            }
        }
        else if(cN.lchild!=null&&cN.rchild==null)
        {
            if(pN.rchild==cN)
            pN.rchild=cN.lchild;
            else{
                pN=s.pop();
                pN.lchild=cN.lchild;
            }
        }
        else if(cN.lchild==null&&cN.rchild!=null)
        {
            if(pN.rchild==cN)
            pN.rchild=cN.rchild;
            else{
                pN=s.pop();
                pN.lchild=cN.rchild;
            }
        }
        else{
            tNode dN=cN;pN=cN; cN=cN.rchild;
            while(cN.lchild!=null)
            {
                pN=cN;cN=cN.lchild;
            }
            if(pN==dN)
            {pN.data=pN.rchild.data;
            pN.rchild=null;
            }
            else{
                dN.data=cN.data;
                pN.lchild=cN.rchild;
            }
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree t1=new Tree();
        t1.root=new tNode(20);
        t1.root.lchild=new tNode(10);
        t1.root.rchild=new tNode(25);
        t1.root.lchild.lchild=new tNode(5);
        t1.root.lchild.rchild=new tNode(15);
        t1.root.lchild.lchild=new tNode(5);
        t1.root.lchild.lchild.lchild=new tNode(4);
        t1.root.lchild.lchild.rchild=new tNode(6);
        t1.root.lchild.rchild.lchild=new tNode(12);
        t1.root.lchild.rchild.rchild=new tNode(18);
        t1.root.lchild.rchild.lchild.rchild=new tNode(14);
        t1.root.rchild.lchild=new tNode(22);
        t1.root.rchild.lchild.rchild=new tNode(23);
        t1.root.rchild.lchild.rchild.rchild=new tNode(24);

        int key=18;
        System.out.println("inorder traversal before deletion:");
        t1.inO(t1.root);
        System.out.println();
        System.out.println("inorder traversal after deletion of "+key+":");
        t1.dNode(key,t1.root);
        t1.inO(t1.root);
    }
    }