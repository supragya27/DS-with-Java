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
    void inOrd(tNode root)
    {
    	if(root==null)
    		return;
    	inOrd(root.lchild);
    	System.out.print(root.data+" ");
    	inOrd(root.rchild);
    }
}

public class Main {
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
        t1.inOrd(t1.root);
	}

}