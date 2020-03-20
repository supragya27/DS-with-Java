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
    void postOrder()
    {
        Stack<tNode> s=new Stack<>();
        tNode cN=root;
        while((!s.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                if(cN.rchild!=null)
                s.push(cN.rchild);
                s.push(cN);
                cN=cN.lchild;
            }
            cN=s.pop();
            if((!s.isEmpty())&&cN.rchild==s.peek())
            {
                s.pop();
                s.push(cN);
                cN=cN.rchild;
            }
            else
            {
                System.out.print(cN.data+" ");
                cN=null;
            }
        }
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
        t1.root.rchild.lchild.rchild=new tNode(8);
        t1.postOrder();
    }
    }