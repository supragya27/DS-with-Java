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
    Stack<Node> getPath(Node root,int d)
    {
        Stack<Node> s=new Stack<>();
        Stack<Node> path=new Stack<>();
        
        s.push(root);
        if(root.data==d)
        return s;
        path.push(root);
        Node cN=root; cN=cN.left;

        while((!s.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                s.push(cN);
                path.push(cN);
                if(cN.data==d)
                {
                System.out.println("found");
                return path;}
                cN=cN.left;
            }
            cN=s.pop();
            if(cN.right==null)
                path.pop();
            if(!s.isEmpty())
            if((s.peek().left==path.peek())&&(cN!=path.peek()))
            path.pop();
            cN=cN.right;
        }

        System.out.println("No such element");
        return new Stack<Node>();
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
        tree.root.left.left.left = new Node(8); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.left.left = new Node(9); 
        tree.root.right.left.right = new Node(10); 
        tree.root.right.right = new Node(7); 
        Stack<Node> s=tree.getPath(tree.root,9);
        while(!s.isEmpty())
        System.out.println(s.pop().data);
    }
    }