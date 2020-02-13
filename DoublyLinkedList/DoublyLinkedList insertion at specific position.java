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
    void display(dLinkList l){
        dNode cN=head;
        while(cN!=null){
            System.out.print(cN.data+" ");
            cN=cN.next;
        }System.out.println();
    }
    void displayRev(dLinkList l){
        dNode cN=head;
        while(cN!=null&&cN.next!=null){
            cN=cN.next;
        }
        while(cN!=null){
            System.out.print(cN.data+" ");
             cN=cN.prev;
        }System.out.println();
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

    dLinkList insertAtN(dLinkList l, int a,int n) throws Exception
    {  int size=0;
       dNode cN=head,temp;
       while(cN!=null){     size++; cN=cN.next;      }
       if(n<1||n>size+1)    //first case when invalid position is given
      { 
          throw new Exception("invalid position is entered");
       }

       else if(head==null&&n==1)  //second case for entry 
                                  //at first pos. in an empty list
       {
        head=new dNode(a);
       }

      else if(n==1)              //third case when the elem is the new head
      {
          temp=new dNode(a);
          temp.next=head;
          head.prev=temp;
          head=temp;
      }
       
       else if(n==size+1)  //fourth case when new elem will 
                           //be inserted at the end of the list
       {
           cN=head;
           while(cN.next!=null)
           cN=cN.next;
             cN.next=new dNode(a);
             cN.next.prev=cN;
       }
       else                 //fifth case when new elem will be 
                           //inserted somewhere in the middle of the list
       {  cN=head;
           for(int m=1;m<n-1;m++){
               cN=cN.next;
           }temp=new dNode(a);
           temp.prev=cN;
           temp.next=cN.next;
           cN.next=temp;
           temp.next.prev=temp;
       }

            return l;
    }
    
}

class Main
{
    public static void main(String[] args)
    {
     dLinkList l3=new dLinkList();
     try
     {
     l3=l3.insert(l3,5);   
     l3=l3.insert(l3,7);  
     l3=l3.insert(l3,8);
     l3=l3.insert(l3,3);   
     l3=l3.insert(l3,10);  
     l3=l3.insert(l3,4);
     l3=l3.insertAtN(l3,9,2); 
     }
     catch(Exception e)
     {
         System.out.println(e.getMessage());
     }  
     if(l3.head==null)
     System.out.println("list is empty");
     else{
     System.out.println("list:");
     l3.display(l3);
     System.out.println("list printed backwards:");
     l3.displayRev(l3);}
    }
    }