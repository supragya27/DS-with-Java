class Node
{
    int data; Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class LinkedList
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    void add(int d)
    {
        if(head==null)
        head=new Node(d);
        else
        {
            Node cN=head;
            while(cN.next!=null)
            cN=cN.next;
            cN.next=new Node(d);
        }
    }
    void middle()
    {
        int f=0;
        Node cN=head,mid=head;
        while(cN!=null)
        {
            f++;
            if(f%2==0&&cN.next!=null)
            mid=mid.next;
            cN=cN.next;
        }
        System.out.println(mid.data);
    }
}
class Main
{
    public static void main(String[] args)
    {
         int f=0;
         LinkedList li=new LinkedList();
         li.add(1);
         li.add(2);
         li.add(3);
         li.add(4);
         li.add(5);
         li.middle();
    }
    }