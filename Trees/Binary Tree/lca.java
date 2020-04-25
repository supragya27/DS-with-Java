import java.util.Stack;
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
    Node LCA(Node root,Node n1,Node n2)
    {
        if(n1==n2)
        return n1;
        return findLCA(root,n1,n2);
    }
    Node findLCA(Node root,Node n1, Node n2)
    {
    if((n1==root&&contains(n1.left,n2))||(n1==root&&contains(n1.right,n2)))
    return n1;
    if((n2==root&&contains(n2.left,n1))||(n2==root&&contains(n2.right,n1)))
    return n2;

    if((contains(root.left,n1)&&contains(root.right,n2))||
       (contains(root.left,n2)&&contains(root.right,n1)))
       return root;

    if(contains(root.left,n1)&&contains(root.left,n2))
    return findLCA(root.left,n1,n2);

    return findLCA(root.right,n1,n2);
    
    
    }
    boolean contains(Node p, Node c)
    {
        Stack<Node> s=new Stack<>();
        Node cN=p;
        while((!s.isEmpty())||cN!=null)
        {
            while(cN!=null)
            {
                if(cN==c)
                return true;
                s.push(cN);
                cN=cN.left;
            }
            cN=s.pop();
            cN=cN.right;
        }
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
        tree.root.left.right.right = new Node(8); 
        tree.root.left.right.right.right = new Node(9); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        Node lowCA=tree.LCA(tree.root,tree.root.left.right.right.right,tree.root.left.right);
        System.out.println(lowCA.data);
    }
    }