import java.util.Scanner;
class dNode{
    int data; dNode next; dNode prev;
    dNode(int d){
        data=d;
        next=null; prev=null; 
    }
}
class dLinkList{
    dNode head;
    dLinkList(){
        head=null;
    }
  
    dLinkList insertStart(dLinkList l, int a){
        if(head==null)
        head=new dNode(a);
        else{
            dNode cN=head;
            cN.prev=new dNode(a);
            cN.prev.next=cN;
            head=cN.prev;
        }
            return l;
    }
   
    void display(dLinkList l){
        dNode cN=head;
        while(cN!=null){
            System.out.print(cN.data+" ");
            cN=cN.next;
        }System.out.println();
    }
    void displayRev(dLinkList l){
        dNode cN=head;
        while(cN.next!=null){
            cN=cN.next;
        }
        while(cN!=null){
            System.out.print(cN.data+" ");
             cN=cN.prev;
        }System.out.println();
    }
}

class Main
{
    public static void main(String[] args)
    {
     
     System.out.println("insertion at beginning:");
     dLinkList l2=new dLinkList();
     l2=l2.insertStart(l2,5);   
     l2=l2.insertStart(l2,7);  
     l2=l2.insertStart(l2,8);   
     l2=l2.insertStart(l2,9);   
     System.out.println("list:");
     l2.display(l2);
     System.out.println("list printed backwards:");
     l2.displayRev(l2);
     
    
    }
    }