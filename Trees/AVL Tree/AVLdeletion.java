class Node{
	int data,height;
	Node left,right;
	Node(int d)
	{
		data=d;
		left=right=null;
		height=1;
	}
}
class AVL
{
	Node root;
	AVL()
	{
		root=null;
	}
	int getHeight(Node n)
	{
		if(n==null)
			return 0;
		return n.height;
	}
	int getBalance(Node n)
	{
		if(n==null)
			return 0;
		return getHeight(n.left)-getHeight(n.right);
	}
	int max(int a,int b)
	{
		return (a>b) ? a : b;
	}
	
	Node insert(Node n,int key)
	{
		if(n==null)
			return new Node(key);
		if(key>n.data)
		{
			n.right=insert(n.right,key);
		}
		else if(key<n.data)
		{
			n.left=insert(n.left,key);
		}
		else
			return n;
		
		n.height=max( getHeight(n.left),getHeight(n.right) )+1;
		
		int b=getBalance(n);
		
		if(b>1&&n.left.data>key)   //LL
			return rightRotate(n);
		else if(b>1&&n.left.data<key)  //LR
		{ n.left=leftRotate(n.left);		
		return rightRotate(n);
		}
		else if(b<-1&&n.right.data<key)   //RR
			return leftRotate(n);
		else if(b<-1&&n.right.data>key)  //RL
		{ n.right=rightRotate(n.right);		
		return leftRotate(n);
		}
		
		return n;
	}
	
	Node leftRotate(Node x)
	{
		Node y=x.right;
		Node z=y.left;
		y.left=x;
		x.right=z;
		
		x.height=max(getHeight(x.left),getHeight(x.right))+1;
		y.height=max(getHeight(y.left),getHeight(y.right))+1;
		
		return y;
		
	}
	
	Node rightRotate(Node x)
	{
		Node y=x.left;
		Node z=y.right;
		
		y.right=x;
		x.left=z;
		
		x.height=max(getHeight(x.left),getHeight(x.right))+1;
		y.height=max(getHeight(y.left),getHeight(y.right))+1;
		
		return y;
	}
	
	void inO(Node n)
	{
		if(n==null)
			return;
		inO(n.left);
		System.out.print(n.data+" ");
		inO(n.right);
	}
	
	Node inOrdSucc(Node root)
	{
		while(root.left!=null)
			root=root.left;
		return root;
	}
	Node delete(Node root,int key)
	{
		if(root==null)
			return root;
		if(root.data>key)
			root.left=delete(root.left,key);
		else if(root.data<key)
			root.right=delete(root.right,key);
		else
		{
			if((root.left==null)||(root.right==null))
			{
				Node temp=null;
				if(root.left==temp)
					temp=root.right;
				else
					temp=root.left;
				if(temp==null)
				{
					temp=root;
					root=null;
				}
				else
					root=temp;
			}
			else
			{
				Node temp=inOrdSucc(root.right);
				root.data=temp.data;
				root.right=delete(root.right,temp.data);
			}
		}
		
		if(root==null)
			return root;
		
		root.height=max(getHeight(root.left),getHeight(root.right))+1;
		
		int b=getBalance(root);
		
		if(b>1&&getBalance(root.left)>=0)
			return rightRotate(root);
		else if(b>1&&getBalance(root.left)<0)
		{
			root.left=leftRotate(root.left);
			return rightRotate(root);
		}
		else if(b<-1&&getBalance(root.right)>=0)
			return leftRotate(root);
		else if(b<-1&&getBalance(root.left)<0)
		{
			root.right=rightRotate(root.right);
			return leftRotate(root);
		}
		
		return root;
			
	}
}
public class Main {
  public static void main(String[] args)
  {
	  AVL avlt=new AVL();
	  avlt.root=avlt.insert(avlt.root,10);
	  avlt.root=avlt.insert(avlt.root,20);
	  avlt.root=avlt.insert(avlt.root,30);
	  avlt.root=avlt.insert(avlt.root,40);
	  avlt.root=avlt.insert(avlt.root,50);
	  avlt.root=avlt.insert(avlt.root,27);
	  System.out.println("In-order traversal:");
	  avlt.inO(avlt.root);
	  System.out.println();
	  avlt.delete(avlt.root, 30);
	  System.out.println("In-order traversal:");
	  avlt.inO(avlt.root);
	  
  }
}