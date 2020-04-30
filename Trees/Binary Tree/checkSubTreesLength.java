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
    int sum(Node root)
    {
        if(root==null)
        return 0;
        int s=0;
        s+=sum(root.left);
        s+=sum(root.right);
        return s+1;
    }
    boolean check(Node root)
    {
        int s=sum(root);
        if(s%2!=0)
        return false;

        return checkBranch(root,s);
    }
    boolean checkBranch(Node root,int tsum)
    {
        if(root==null)
        return false;

        int s=sum(root);
        if(tsum-s==s)
        return true;

        boolean res;
        res=checkBranch(root.left,tsum);
        if(res==false)
        res=checkBranch(root.right,tsum);
        return res;
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
        tree.root.left.right.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        System.out.println(tree.check(tree.root));
    }
    }