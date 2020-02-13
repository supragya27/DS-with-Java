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
        newNode.next=null;
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
       l1=l1.insert(l1,19);    
       l1=l1.insert(l1,55);
       System.out.println("list:");
       l1.display(l1);
    }
    }