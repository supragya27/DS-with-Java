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
    dLinkList insert(dLinkList l, int a){
        if(head==null)
        head=new dNode(a);
        else{
            dNode cN=head,pN=head; int f=0;
            while(cN.next!=null){
                cN=cN.next;
                if(f==1)
                pN=pN.next;
                f=1;
            }
            cN.next=new dNode(a);
            cN.next.prev=cN;
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
     System.out.println("insertion at end:");
     dLinkList l=new dLinkList();
     l=l.insert(l,5);   
     l=l.insert(l,7);  
     l=l.insert(l,8);   
     l=l.insert(l,9);   
     System.out.println("list:");
     l.display(l);
     System.out.println("list printed backwards:");
     l.displayRev(l);

    
     
    
    }
    }