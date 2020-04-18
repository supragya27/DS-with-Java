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
    void preO(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }
    void calcHt(Node root,Node n,int ht,Map<Node,Integer> map)
    {
       if(root==null)
       return;
       if(root.left==n||root.right==n)
        map.put(root,ht+1);
        calcHt(root.left,n,ht+1,map);
        calcHt(root.right,n,ht+1,map);
    }
    boolean checkCousin(Node root,Node n1,Node n2)
    {
        Map<Node,Integer> map=new HashMap<>();
        calcHt(root,n1,1,map);
        calcHt(root,n2,1,map);
        Set< Map.Entry< Node,Integer> > st = map.entrySet();   
        if(map.size()==1)
        return false;
        if(map.get(n1)==map.get(n2))
        return true;
        return false;
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
        System.out.println(
        tree.checkCousin(tree.root,tree.root.left.left,tree.root.right.right));
    }
    }