import java.util.Scanner;
class dNode{
    int data;dNode prev; dNode next;
    dNode(int a){
        data=a;
    }
}
class dLinkList{
    dNode head;
    dLinkList(){
        head=null;
    }
    dLinkList insert(dLinkList l, int d){
        dNode temp,cN;
        if(head==null){
            head=new dNode(d);
            return l;
        }
        cN=head;
        while(cN.next!=null){
          cN=cN.next;
        }
        temp=new dNode(d);
        cN.next=temp;
        temp.prev=cN;
        return l;
    }
    void display(dLinkList l){
        
        if(head==null)
            System.out.println("List Empty");        
        else{
        
        dNode cN=head;
        while(cN!=null){
            System.out.print(cN.data+" "); cN=cN.next;
        }System.out.println();
        }
    }
    dLinkList removeAtN(dLinkList l,int n){
        dNode cN=head; int size=0;
        while(cN!=null){
            size++; cN=cN.next;
        }
        if(head==null){
            System.out.println("list is empty, no element to be deleted.");
            return l;
        }
        else if(n<1||n>size){
            System.out.println("invalid position entered.");
            return l;
        }        
        else if(n==1){
            cN=head.next;
            head=cN;
            head.prev=null;
            return l;
        }
        else if(n==size){
            cN=head;
            while(cN.next!=null)
            cN=cN.next;
            cN.prev.next=null;
            return l;
        }
        else{
            cN=head;
            for(int a=1;a<n-2;a++){
                    cN=cN.next;
            }
                    cN.next=cN.next.next;
                    cN.next.prev=cN;
                    return l;
        }
        
        }
    }

class Main
{
    public static void main(String[] args)
    {
        dLinkList l=new dLinkList();
        l=l.insert(l,5);
        l=l.insert(l,3);
        l=l.insert(l,7);
        l=l.insert(l,8);
        l=l.removeAtN(l,3);
        l.display(l);
    }
    }