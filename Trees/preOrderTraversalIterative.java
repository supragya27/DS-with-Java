import java.util.Scanner;
class sNode
{
  public tNode data; 
  public sNode next; 
  public sNode(tNode dd) 
  { data = dd; }
} 

class Stack
{
  private sNode first; 
  public Stack() 
  {
    first=null;
  }

  public boolean isEmpty()
  {
    if(first==null)
      return true;
    return false;
  }

  public void push(tNode dd)
  {
    sNode nN=new sNode(dd);
    nN.next=first;
    first=nN;
  }

  public tNode pop()
  {
    if(isEmpty()==true)
      return null;
    sNode nN=first;
    first=first.next;
    return nN.data;
  }
}

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
    void preOrder(tNode root)
    {
        Stack S=new Stack();
        tNode cN=root;
        while(S.isEmpty()==false||cN!=null)
        {
            while(cN!=null)
            {
                S.push(cN);
                System.out.print(cN.data+" ");
                cN=cN.lchild;
            }
            cN=S.pop();
            cN=cN.rchild;
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
        t1.root.rchild.lchild.rchild=new tNode(8);
        t1.preOrder(t1.root);
    }
}