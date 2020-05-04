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
class Tree
{
    Node root;
    Tree()
    {
        root=null;
    }
    void populateMap(Node root,int ht,TreeMap <Integer,Integer> m)
    {
        if(root==null)
        return;

        if(m.get(ht)==null)
        {
            m.put(ht,1);
        }
        else
        {
            int c=m.get(ht);
            c++;
            m.put(ht,c);
        }
        populateMap(root.left,ht+1,m);
        populateMap(root.right,ht+1,m);
    }
    boolean checkPerfect(Node root)
    {
          TreeMap <Integer,Integer> m=new TreeMap<>();
          populateMap(root,0,m);

          for(int i=0;i<m.size();i++)
          {
              if(m.get(i)!=Math.pow(2,i))
              return false;
          }
          return true;

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
        tree.root.left.left.right = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        System.out.println(tree.checkPerfect(tree.root));
    }
    }