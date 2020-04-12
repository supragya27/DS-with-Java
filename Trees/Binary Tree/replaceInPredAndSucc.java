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
      Vector<Integer> in=new Vector<>();
      static int idx=0;
      Tree()
      {
          root=null;
      }
    void storeInO(Node root)
    {
        if(root==null)
            return;
        storeInO(root.left);
        in.add(root.data);
        storeInO(root.right);
    }
    void replace(Node root)
    {
        if(root==null)
        return;
        replace(root.left);
        if(idx==0)
        {
        if(in.size()>1)
        root.data=in.get(1);idx++;
        }
        else if(idx==in.size()-1)
        root.data=in.get(idx-1);
        else{
        root.data=in.get(idx-1)+in.get(idx+1);idx++;}
        replace(root.right);
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
    public static void main(String args[])
    {
        Tree tree=new Tree();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 

        tree.storeInO(tree.root);
        tree.replace(tree.root);
        tree.preO(tree.root);
    }
}