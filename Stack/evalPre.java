/* isFull(), isEmpty(), push(int), int pop() are available functions on Stack. */
class Result {
  static int evalPrefix(CQStack s, String exp) {
int num=0,n1,n2;
for(int a=exp.length()-1;a>=0;a--){
  if(exp.charAt(a)>='0'&&exp.charAt(a)<='9')
  {
    num=exp.charAt(a)-'0';
    s.push(num);
  }
  else
  {
   n2=s.pop();
    n1=s.pop();
    switch(exp.charAt(a)){
      case '+':
          num=n2+n1;
        break;
        case '-':
          num=n2-n1;
        break;
        case '*':
          num=n2*n1;
        break;
        case '/':
          num=n2/n1;
        break;
      case '^':
          num=(int)Math.pow(n2,n1);
       
    }
    s.push(num);
  }
}
 return s.pop();
  }
}