import java.util.Scanner;
class Node
{
    Node next; int data;
    Node(int a)
    {
        data=a;next=null;
    }
}
class LinkedList
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    void insert(int d)
    {
        if(head==null)
        {
            head=new Node(d);
            return;
        }
        Node cN=head;
        while(cN.next!=null)
        cN=cN.next;
        cN.next=new Node(d);
    }
    void print()
    {
        if(head==null)
        return;
        Node cN=head;
        while(cN!=null)
        {
            System.out.print(cN.data+" ");
            cN=cN.next;
        }
        System.out.println();
    }
    void reverse()
    {
        if(head==null)
        return;
        Node cN=head,a;
        LinkedList nL=new LinkedList();
        while(cN!=null)
        {
            if(nL.head==null){
                a=new Node(cN.data);
            nL.head=a;}
            else
            {
                a=new Node(cN.data);
                a.next=nL.head;
                nL.head=a;
            }
            cN=cN.next;
        }
        head=nL.head;
    }
}
class Main
{
    public static void main(String[] args)
    {
        LinkedList l1=new LinkedList();
        l1.insert(5);
        l1.insert(4);
        l1.insert(3);
        l1.insert(2);
        l1.insert(1);
        l1.print();
        l1.reverse();
        l1.print();
    }
    }