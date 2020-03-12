/* enqueue(int) & dequeue() are available on queues.*/
/* enqueue(int) & dequeue() are available on queues.*/
class Stack
{
  void push(QueueArray qa1, QueueArray qa2, int item)
  {
    qa2.enqueue(item);
    int a=qa1.dequeue();
    while(a!=-1){
      qa2.enqueue(a);
      a=qa1.dequeue();}
    a=qa2.dequeue();
    while(a!=-1){
      qa1.enqueue(a);
      a=qa2.dequeue();
    }
  }


  int pop(QueueArray qa1, QueueArray qa2)
  {
    int a=qa1.dequeue();
    if(a==0)
      a=-1;
    int b=a,f=0;
    while(b!=-1){
      if(f==1)
      qa2.enqueue(b);
      b=qa1.dequeue();
      f=1;
    }
    b=qa2.dequeue();
    while(b!=-1){
      qa1.enqueue(b);
      b=qa2.dequeue();
    }
    return a;
  }
}