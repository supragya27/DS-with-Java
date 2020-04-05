package Trees;
class PostGen
{
	static int i=0;
	void printPost(int pre[],int in[],int s,int e)
	{
		if(e-s<1)
			return;
		if(e-s==1)
		{
			System.out.print(in[s]+" "); i++;
			return;
		}
		int a;
		
		for(a=s;a<e;a++)
		{
			if(in[a]==pre[i])
			{
				i++;break;
			}
		}
		printPost(pre,in,s,a);
		printPost(pre,in,a+1,e);
		System.out.print(in[a]+" ");
	}
}
public class PostFromPreIn {
      public static void main(String args[])
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

          int pre[]= {1, 2, 4, 5, 3, 6, 8, 7},in[]= {4, 2, 5, 1, 6, 8, 3, 7 };

          PostGen p=new PostGen();
          p.printPost(pre, in, 0, in.length);
      }
}
