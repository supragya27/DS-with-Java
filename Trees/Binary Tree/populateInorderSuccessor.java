import java.util.Vector;
class Node
{
    int data;Node left,right,next;
    Node(int d)
    {
        data=d;
        left=right=next=null;
    }
}
 class Tree
  {
      Node root,pN=null;
      Vector<Integer> in=new Vector<>();
      static int idx=0;
      Tree()
      {
          root=null;
      }
    void InO(Node root)
    {
        if(root==null)
            return;
        InO(root.left);
        if(pN!=null)
        pN.next=root;
        pN=root;
        InO(root.right);
    }
    

     void printInOrder(Node root)
    {
        if(root==null)
            return;
        printInOrder(root.left);
            System.out.print(root.data+" ");
        printInOrder(root.right);
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
        tree.InO(tree.root);
        tree.printInOrder(tree.root);
        System.out.println();
        System.out.print(tree.root.left.left.next.data);

        
    }
}