class CQStack{
  int max;
  int[] arr;
  int top;
  CQStack(int l){
    max=l;
    arr=new int[l];
    top=-1;
  }
  void push(int a){
    if(isFull()==true){
      return;
    }
    arr[++top]=a;
  }
  int pop(){
    if(isEmpty()==true){
      return -1;
    }
    return arr[top--];
  }
  Boolean isFull(){
    if(top==max-1)
      return true;
    return false;
  }
  Boolean isEmpty(){
    if(top==-1)
      return true;
    return false;
  }
  int size(){
    return top+1;
  }
}
class Result
{
  static int minReversal(String expr)
  {   if((expr.length()%2)==1)
    return -1;
        int a,min=0;
   char arr[]=expr.toCharArray();
     }*/
    CQStack ob=new CQStack(expr.length());
    
   for(a=0;a<expr.length();a++){
     if(arr[a]==']'&&(ob.isEmpty()==true))
     {  char c;
       arr[a]='[';min++;
       a--;
     }
     else if(arr[a]==']')
     {
       ob.pop();
     }
     else if(ob.size()<(expr.length()-(a+1)))
       ob.push('[');
     else{
       arr[a]=']';
       min++;
     }
   }
    return min;
  }
}