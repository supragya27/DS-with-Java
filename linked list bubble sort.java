import java.util.Scanner;
class Node{
    int data; Node next;
    Node(int d){
        data=d; next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }
    LinkedList insert(LinkedList l, int a){
        Node currNode;
        if(head==null){
          currNode=new Node(a);
          head=currNode;
        }
        else{
            currNode=head;
           while(currNode.next!=null){
               currNode=currNode.next;
           }
           Node newN=new Node(a);
           currNode.next=newN;
        }
        return l;
    }
    void display(LinkedList l){
        Node currNode=head;
           while(currNode!=null){
               System.out.print(currNode.data+" ");
               currNode=currNode.next;
           }      System.out.println();        
    }
    LinkedList bubblesort(LinkedList l){
          Node sNode=head;
          Node cNode, temp,pNode; 
          temp=new Node(0);
          int s=0,f;
          while(sNode!=null){
              s++;sNode=sNode.next;}
              
          for(int a=0;a<s;a++)
             {  cNode=head;pNode=head;
                 for(int b=0;b<s-1-a;b++){
                     f=0;
                  if((cNode.next!=null)&&(cNode.data>cNode.next.data))
                  {       
                      if(cNode==head){
                        head=cNode.next;
                        temp.data=cNode.data;
                        temp.next=cNode;             
                        cNode.next=head.next; 
                        head.next=temp.next; 
                        f=1;
                        //System.out.println("if ran");
                      }   
                      else if(cNode.next.next==null){
                         pNode.next=cNode.next;
                         pNode.next.next=cNode;
                         cNode.next=null;
                          f=1;
                      }
                      else{
                        temp.next=cNode.next.next;
                         pNode.next=cNode.next;
                         pNode.next.next=cNode;
                         cNode.next=temp.next;
                         f=1;
                       // System.out.println("else ran");
                      }                     
                   }
                   if(b>0)                  
                   pNode=pNode.next;
                   else
                   pNode=head;


                   if(f==0)
                   cNode=cNode.next;

                  // System.out.print("list: ");
                  // l.display(l);                  
          //  System.out.println("cNode data after change= "+cNode.data);
          //  System.out.println("pNode data after change= "+pNode.data);
                 }

                 }
              
                   
             return l;
              }
}
class Main
{
    public static void main(String[] args)
    {
        LinkedList li=new LinkedList();
        li=li.insert(li,8);
        li=li.insert(li,5);
        li=li.insert(li,3);
        li=li.insert(li,7);
        li=li.insert(li,2);
        li=li.insert(li,14);
        li=li.insert(li,4);
        li=li.insert(li,3);
        li.display(li);
        li=li.bubblesort(li);
        li.display(li);
    }
    }