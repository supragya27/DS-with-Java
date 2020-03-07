import java.util.*;

class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if(rear==SIZE-1)
      return;
    if(front==-1)
      front=0;
    array[++rear]=item;
  }

  // Method to remove an item from queue.
  int dequeue()
  {
    if(front==-1||front-1==rear)
      return -1;
    return array[front++];
  }
}