import java.util.*;
//vertical order traversal using hashmap
class Node
{
    int data;Node left,right;
    Node(int d)
    {
        data=d;left=right=null;
    }
}
class BinaryTree
{
    Node root;
    BinaryTree()
    {
        root=null;
    }
    void printV(Node root)
    {
        if(root==null)   return;
        TreeMap<Integer,Vector<Integer>> m=new TreeMap<>();

        storeV(root,0,m);

        for(Map.Entry<Integer,Vector<Integer>> ent:m.entrySet())
        {
            System.out.println(ent.getValue());
        }
    }

    void storeV(Node root,int h, TreeMap<Integer,Vector<Integer>> m)
    {
        if(root==null)
        return;
        Vector <Integer> get=m.get(h);
        if(get==null)
        {
            get=new Vector<>();
        }
        get.add(root.data);
        m.put(h,get);

        storeV(root.left,h-1,m);
        storeV(root.right,h+1,m);
    }
}
class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree(); 

		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 		
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		tree.root.right.left.right = new Node(8); 
		tree.root.right.right.right = new Node(9); 

		System.out.println("vertical order traversal is :"); 
		tree.printV(tree.root); 
    }
    }