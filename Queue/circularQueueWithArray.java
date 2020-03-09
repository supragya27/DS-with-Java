/*  static int SIZE=4;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  These variables are set for the queue. */

  void enqueue(int item)
  {
      if(front==-1){
        front=0;rear=0;array[rear]=item;
      }
    else if(front==0&&rear==SIZE-1)
      return;
    else if(front==0&&rear!=SIZE-1)
      array[++rear]=item;
    else if(front!=0&&rear==SIZE-1){
      rear=0; array[rear]=item;
    }
    else if(front!=0&&rear+1==front)
      return;
    else if(front!=0&&rear+1!=front)
      array[++rear]=item;
  }

  int dequeue()
  {
if(front==-1)
  return -1;
    else if(front==rear){
      int a=array[front]; front=-1;rear=-1; return a;
    }
    else if(front==SIZE-1){
      int a=array[front]; front=0; return a;
    }
    else
      return array[front++];
  }