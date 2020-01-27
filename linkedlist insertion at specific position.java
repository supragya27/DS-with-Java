import java.util.Scanner;
class Node{
    int data; Node next;
    Node(int d){
        data=d;
        next=null;
    }
    }
class LinkedList{
    Node head;
    public LinkedList(){
     head=null;
    }
   
    //method to insert at the end of the list
    LinkedList insert(LinkedList l,int d){
        Node newNode=new Node(d);
        Node currentNode;
        if(l.head==null)
        l.head=newNode;
        else{
            currentNode=l.head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        } return l;
    }

    //method to insert at specified position
    LinkedList insert(LinkedList l,int d,int n) throws Exception
    {
        Node cN=head,temp;  int size=0;
        while(cN!=null)
        {
        size++; cN=cN.next;
        }
        
        if(n<1||n>size+1)  //case 1 if invalid position is entered
        {
            throw new Exception("invalid position entered");
        }
        else if(n==1&head==null)  //case 2 if list is empty
        {
            head=new Node(d);
        }
        else if(n==1){  //case 3 if element is the new head
            cN=head;
            temp=new Node(d);
            temp.next=cN;
            head=temp;
        }
        else if(n==size+1)  //case 4 if element will be at the end of list
        {
            temp=new Node(d);
            cN=head;
            while(cN.next!=null){
                cN=cN.next;
            }
            cN.next=temp;
        }
        else           //case 5 for any position in middle
        {
            Node pN=head; cN=head; int f=0;
            while(--n>0){
                cN=cN.next;
                if(f==1)
                pN=pN.next;
                f=1;
            }
            temp=new Node(d);
            temp.next=cN;pN.next=temp;            
        }
        
         
         return l;
    }
    void display(LinkedList l){
        Node newN=l.head;
        while(newN!=null){
        System.out.print(newN.data+" "); newN=newN.next;}
        System.out.println();
    }
}
class Main
{

    public static void main(String[] args)
    {
       LinkedList l1=new LinkedList();    
       l1=l1.insert(l1,15);    
       l1=l1.insert(l1,16);    
       l1=l1.insert(l1,18);    
       l1=l1.insert(l1,17);    
       l1=l1.insert(l1,12);    
       l1=l1.insert(l1,1);    
       l1=l1.insert(l1,55);
       try{
       l1=l1.insert(l1,19,7);    
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }


       if(l1.head==null)
       System.out.println("List is empty");
       else{
       System.out.println("list:");
       l1.display(l1);}
    }
    }