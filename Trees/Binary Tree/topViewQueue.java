import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
  class qNode
   {
       Node n;int h;
       qNode(Node n,int h)
       {
           this.n=n;
           this.h=h;
       }
   }
class Tree
{
    Node root;
    Tree()
    {
        root=null;
    }
 
   
   static void topView(Node root)
   {
       TreeMap<Integer,Node> m=new TreeMap<>();
       Queue<qNode> q=new LinkedList<>();
       if(root!=null)
       q.add(new qNode(root,0));

       populateMap(m,q);
       printTopView(m);
   }

   static void populateMap(TreeMap<Integer,Node> m,Queue <qNode> q)
   {
       if(q.isEmpty())
       return;

       qNode qn=q.remove();
       if(m.get(qn.h)==null)
       m.put(qn.h,qn.n);

       if(qn.n.left!=null)
       q.add(new qNode(qn.n.left,qn.h-1));
       if(qn.n.right!=null)
       q.add(new qNode(qn.n.right,qn.h+1));

       populateMap(m,q);
   }



   static void printTopView(TreeMap<Integer,Node> m)
   {
       for(Map.Entry<Integer,Node> e:m.entrySet())
       {
           System.out.println(e.getValue().data);
       }
   }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.right.right = new Node(8); 
        tree.root.left.right.right.right = new Node(9); 
        tree.root.left.right.right.right.right = new Node(10); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 

        tree.topView(tree.root);
    }
    }