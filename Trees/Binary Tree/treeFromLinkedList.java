import java.util.*;
class lNode
{
    int data; lNode next;
    lNode(int d)
    {
        data=d;next=null;
    }
}
class linkedList
{
    lNode head;
    linkedList()
    {
        head=null;
    }
    void insert(int d)
    {
        if(head==null)
        {
            head=new lNode(d);return;
        }
        lNode cN=head;
        while(cN.next!=null)
        cN=cN.next;
        cN.next=new lNode(d);
    }
}
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
    Node constTree(lNode head)
    {
        if(head==null)
        return null;
        Queue<Node> q=new LinkedList<>();
        lNode cN=head;
        Node root=new Node(cN.data);
        Node ctn=root;
        q.add(ctn);
        cN=cN.next;
        while(cN!=null)
        {
            ctn=q.peek();
            if(ctn.left==null)
            {
                ctn.left=new Node(cN.data);
                q.add(ctn.left);
            }
            else
            {
                ctn.right=new Node(cN.data);
                q.add(ctn.right);
                q.remove();
            }
            cN=cN.next;
        }
        return root;
    }
}

class Main
{
    public static void main(String[] args)
    {
        linkedList l=new linkedList();
        l.insert(10);
        l.insert(12);
        l.insert(15);
        l.insert(25);
        l.insert(30);
        l.insert(36);
        Tree t=new Tree();
        Node root=t.constTree(l.head);
        t.preO(root);

    }
    }