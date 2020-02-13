import java.util.Scanner;
class Node{
    int data; Node next;
    Node(int d){
        data=d;
    }
}
class cLinkList{
    Node head;
    cLinkList(){
        head=null;
    }
    cLinkList insert(cLinkList l, int d){
        if(head==null){
        head=new Node(d);
        head.next=head;
        return l;
        }
        Node cN=head;
        while(cN.next!=head){
            cN=cN.next;
        }
        Node temp=new Node(d);
        cN.next=temp;
        temp.next=head;
        return l;

    }
    void display(cLinkList l){
        if(head==null){
        System.out.println("list is empty");return;}
        Node cN=head;
        int f=0;
        while(f==0){
             System.out.print(cN.data+" ");
             if(cN.next==head)
             f=1;
             cN=cN.next;
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
     cLinkList l=new cLinkList();
     l=l.insert(l,5);
     l=l.insert(l,7);
     l=l.insert(l,9);
     l=l.insert(l,11);   
     l.display(l);
    }
    }