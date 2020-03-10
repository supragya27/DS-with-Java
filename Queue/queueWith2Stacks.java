/* push(int), pop(), isEmpty(), isFull() are available on Stack. */
class Queue
{
  void enqueue(CQStack st1, CQStack st2, int item)
  {
    int a=st1.pop();
        while(a!=-1){
          st2.push(a);
          a=st1.pop();
        }
        st2.push(item);
    a=st2.pop();
    while(a!=-1){
      st1.push(a);
      a=st2.pop();
    }
  }

  int dequeue(CQStack st1, CQStack st2)
  {
    return st1.pop();
  }
}