class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  { maxSize=s;
    stackArray=new int[s];
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull()==true)
      return;
    stackArray[++top]=j;
  }
  
  public int pop() // take item from top of stack
  {
    if(isEmpty()==true)
      return -1;
    int a=stackArray[top--];
    return a;
  }

  public boolean isEmpty() // true if stack is empty
  {
    if(top==(-1))
      return true;
    return false;
  }

  public boolean isFull() // true if stack is full
  {
    if(top==(maxSize-1))
      return true;
    return false;
  }
}