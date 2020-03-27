import java.util.Scanner;
class sNode
{
  tNode data; 
  sNode next; 
  sNode(tNode dd) 
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
    void inOrderTraversal()
    {   int f=1;
        if(root==null)
        return;
        Stack S=new Stack();
        tNode cN=root;
        S.push(cN);
        cN=cN.lchild;
        while(!(S.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                if(f==1)
                S.push(cN);                
                cN=cN.lchild;
                f=1; 
            }
            cN=S.pop();
            
            System.out.print(cN.data+" ");
            cN=cN.rchild; 
            if(cN!=null){
            S.push(cN);f=0;}
            
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
        t1.inOrderTraversal();
    }
    }