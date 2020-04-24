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
    boolean hasNode(Node root, int key,ArrayList<Integer> ali)
    {
        if(root==null)
        return false;
        ali.add(root.data);
        if(root.data==key)
        return true;
        if(hasNode(root.left,key,ali)||hasNode(root.right,key,ali))
        return true;
        ali.remove(ali.size()-1);
        return false;
    }
    void printPath(Node root, int key)
    {
        ArrayList<Integer> ali=new ArrayList<>();
        if(hasNode(root,key,ali))
        {
            for(int i=0;i<ali.size();i++)
            System.out.print(ali.get(i)+" ");
        }
    }
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
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
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.printPath(tree.root,7);
    }
    }