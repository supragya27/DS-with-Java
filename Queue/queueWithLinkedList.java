import java.util.*;
class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
  }
}

class QueueLinkedList
{
  public QueueNode front, rear;

  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    if(front==null){
      front=new QueueNode(data);rear=front;
      return;
    }
    rear.next=new QueueNode(data);
    rear=rear.next;
  }    

  /*  Function to DeQueue an element from the Queue */
  public int DeQueue()
  { if(front==null)
    return -1;
   int a=front.data;
   front=front.next;
   return a;

  }    
}