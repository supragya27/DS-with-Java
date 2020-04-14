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
    Node construct(int pre[],char nl[])
    {
       if(pre.length==0)
       return null;
       
       Stack<Node> s=new Stack<>();
       Node root=new Node(pre[0]);
       Node cN=root;
       s.push(cN);

       for(int i=1;i<pre.length;i++)
       {
           if(nl[i]=='N')
           {
               if(cN.left==null)
               {
                   cN.left=new Node(pre[i]);
                   cN=cN.left;
                   s.push(cN);
               }
               else if(cN.right==null)
               {
                   cN.right=new Node(pre[i]);
                   cN=cN.right;
                   s.push(cN);
               }
               else
               {
                   cN=s.pop();
                   cN.right=new Node(pre[i]);
                   cN=cN.right;
                   s.push(cN);
               }
           }
           else
           {
               if(cN.left==null)
               {
                   cN.left=new Node(pre[i]);
                   if(!s.isEmpty())
                   cN=s.pop();
               }
               else if(cN.right==null)
               {
                   cN.right=new Node(pre[i]);
                   if(!s.isEmpty())
                   cN=s.pop();
               }
               else
               {
                   if(!s.isEmpty())
                   cN=s.pop();
                   cN.right=new Node(pre[i]);
               }
           }
       }
       return root;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        int pre[]={10,30,20,5,1,2,15};
        char nl[]={'N','N','L','N','L','L','L'};
        //the array nl tells if the corresponding element of array pre is a leaf or a node with childern
        Node root=tree.construct(pre,nl);
        tree.preO(root);
    }
    }