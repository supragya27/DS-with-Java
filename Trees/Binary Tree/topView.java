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
    class loc{
        int data,h;
        loc(int data,int h)
        {
            this.data=data;
            this.h=h;
        }
    }
    Tree()
    {
        root=null;
    }
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }
    void printTopView(TreeMap<Integer,loc> m)
    {
         for(Map.Entry<Integer,loc> e:m.entrySet())
         System.out.println(e.getValue().data);
    }
    void topView(Node root)
    {
         TreeMap<Integer,loc> m=new TreeMap<>();
         

          populateMap(root,0,0,m);
        printTopView(m);
    }
    void populateMap(Node root,int h,int v,TreeMap<Integer,loc> m)
    {
        if(root==null)
        return;

        if(m.get(v)==null)
        m.put(v,new loc(root.data,h));
        else if(m.get(v).h>h)
        m.put(v,new loc(root.data,h));

        populateMap(root.left,h+1,v-1,m);
        populateMap(root.right,h+1,v+1,m);
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