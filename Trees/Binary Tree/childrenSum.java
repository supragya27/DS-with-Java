import java.util.Vector;
class Node
{
    int data;Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
 class Tree
  {
      Node root;
    void preO(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }
    boolean checkChildrenSum(Node root,boolean res)
    {
        if(res==true)
        {
            if(root.left==null&&root.right==null)
            res=true;
            else if(root.left==null||root.right==null)
            {
                if(root.left!=null)
                if(root.data==root.left.data)
                res= true;
                else
                res= false;
                else
                if(root.data==root.right.data)
                res= true;
                else
                res= false;
            }
            else
            {
                if(root.data==root.left.data+root.right.data)
                res=true;
                else
                res=false;
            }
            if(root.left!=null)
            res=checkChildrenSum(root.left,res);
            if(root.right!=null)
            res=checkChildrenSum(root.right,res);

            
        }
        return res;
    }
    
}
class Main
{
    public static void main(String args[])
    {
        Tree tree=new Tree();
         tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.right = new Node(2); 

        if(tree.checkChildrenSum(tree.root,true))
        System.out.println("the tree satisfies the property");
        else
        System.out.println("the tree does not satisfy the property");
    }
}