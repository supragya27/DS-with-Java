class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class linkedList
{
    Node head;
    linkedList()
    {
        head=null;
    }
    void add(int d)
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
    void print(Node head)
    {
        while(head!=null){
        System.out.print(head.data+" ");head=head.next;}
        System.out.println();
    }
    Node addTwoList(Node h1,Node h2)
    {
        Node hr=null,head=null;
        int r=0,rl=0;
        while((h1!=null)&&(h2!=null))
        {
            int sum=h1.data+h2.data+r;
            if(sum>9)
            r=sum/10;
            else
            r=0;
            if(hr==null)
            {
                hr=new Node(sum%10);
                head=hr;
            }
            else{
                hr.next=new Node(sum%10);
                hr=hr.next;
            }
           
            h1=h1.next;
            h2=h2.next;
        }
        while(h1!=null)
        {
            int sum=h1.data+r;
            if(sum>9)
            {
                r=sum%9;
            }
            else
            r=0;

            hr.next=new Node(sum%10);
            hr=hr.next;
            h1=h1.next;
        }
        while(h2!=null)
        {
            int sum=h2.data+r;
            if(sum>9)
            {
                r=sum%9;
            }
            else
            r=0;

            hr.next=new Node(sum%10);
            hr=hr.next;
            h2=h2.next;
        }
        if(r!=0)
        hr.next=new Node(r);
        return head;
    }
}
class Main
{
    public static void main(String[] args)
    {
        linkedList l1=new linkedList();
        linkedList l2=new linkedList();
        l1.add(1);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.print(l1.head);
        l2.add(9);
        l1.print(l2.head);
        Node res=l1.addTwoList(l1.head,l2.head);
        l1.print(res);
    }
    }