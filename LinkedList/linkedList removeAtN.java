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
    LinkedList removeAtN(LinkedList l,int n){
        
        if(head==null)
        {
            System.out.println("Nothing to be deleted, list is empty.");
            return l;
        }
        Node cN=head,temp;;int size=0;
        while(cN!=null){
            size++; cN=cN.next;
        }
        
        if(n<1||n>size){
            System.out.println("Invalid position entered.");
            return l;
        }
        else if(n==1){
              head=head.next;
              return l;
        }
        else if(n==size)
        {
            cN=head;
            while(cN.next.next!=null)
            cN=cN.next;
            cN.next=null;
            return l;
        }
        else{
            cN=head;
            for(int a=1;a<n-1;a++){
                cN=cN.next;
            }
            cN.next=cN.next.next;
            return l;
        }
       
    }
    void display(LinkedList l){
        Node newN=l.head;
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        else{
        while(newN!=null){
        System.out.println(newN.data+" "); newN=newN.next;}}
    }
}
class Main
{

    public static void main(String[] args)
    {
       LinkedList l1=new LinkedList();    
       l1=l1.insert(l1,15);   
       l1=l1.insert(l1,18);   
       l1=l1.insert(l1,25);   
       l1=l1.insert(l1,28);   
       l1=l1.insert(l1,35); 
       l1=l1.removeAtN(l1,0);
       l1.display(l1);
       
    }
    }