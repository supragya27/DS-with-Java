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
    dLinkList removeLast(dLinkList l){
        if(head==null){
            System.out.println("list is empty, no element to be deleted.");
            return l;
        }else{
        dNode cN=head;
        if(cN.next==null){
            head=null;
            return l;
        }
        while(cN.next!=null)
        cN=cN.next;
        cN.prev.next=null;
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
        l=l.removeLast(l);
        l=l.removeLast(l);
        l=l.removeLast(l);
        l=l.removeLast(l);
        l=l.removeLast(l);
        l.display(l);
    }
    }