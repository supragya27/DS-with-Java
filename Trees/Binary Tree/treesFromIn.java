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
 class treesFromInOrder {
    void preO(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preO(root.left);
        preO(root.right);
    }
    Vector<Node> getTrees(int[] in,int s,int e)
    {
        Vector<Node> trees=new Vector<>();
        if(s>e)
        {
            trees.add(null);
            return trees;
        }
        for(int i=s;i<=e;i++)
        {

            Vector<Node> ltrees=getTrees(in,s,i-1);
            Vector<Node> rtrees=getTrees(in,i+1,e);

            for(int a=0;a<ltrees.size();a++)
            {
                for(int b=0;b<rtrees.size();b++)
                {
                    Node node=new Node(in[i]);
                    node.left=ltrees.get(a);
                    node.right=rtrees.get(b);
                    trees.add(node);
                }
            }

        }

        return trees;
    }
}
class Main
{
    public static void main(String args[])
    {
         treesFromInOrder tree=new treesFromInOrder();
        int[] in={1,2,3};
        Vector<Node> trees=tree.getTrees(in,0,in.length-1);
        for(int i=0;i<trees.size();i++)
        {
            tree.preO(trees.get(i));
            System.out.println();
        }
    }
}