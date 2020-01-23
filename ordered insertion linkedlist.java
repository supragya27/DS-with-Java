import java.util.Scanner;
class Node{
    int data; Node next;
    Node(int a){
        data=a;
        next=null;
    }
}
class LinkList{
    Node head;
   LinkList(){
       head=null;
   }
   LinkList ordinsert(LinkList l,int a){
       if(head==null){
           head=new Node(a);
       }
       else{
           int f=0;
           Node cN=head,temp,pN=head;
           while(cN!=null){
               if((cN.data>a)&&(cN==head)){
                 temp=new Node(a);
                 temp.next=head;
                 head=temp;
               }
               else if(cN.data>a){
                 temp=new Node(a);
                 pN.next=temp;
                 temp.next=cN;                 
               }
               
               else if(cN.next==null){
                   temp=new Node(a);
                   cN.next=temp;
                   break;
               }
                if(f==1)
                pN=pN.next;
                cN=cN.next;
                f=1;
           }
       }
       return l;
   }
   void display(LinkList l){
       Node a=head;
       while(a!=null){
           System.out.print(a.data+" ");
           a=a.next;
       }
       System.out.println();
   }
}
class Main
{
    public static void main(String[] args)
    {
        LinkList l=new LinkList();
        l=l.ordinsert(l,5);
        l=l.ordinsert(l,2);
        l=l.ordinsert(l,3);
        l=l.ordinsert(l,4);
        l=l.ordinsert(l,7);
        l=l.ordinsert(l,14);
        l=l.ordinsert(l,8);
        l=l.ordinsert(l,10);
        l.display(l);
    }
    }