/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */
class Result {
  static int checkPalindrome(Node head) {
    if(head==null)
      return 0;
int s=0,m,n,flag=0;Node a=head,b;
    
    while(a!=null){
      s++;a=a.next;
    }
    {
      for(m=1;m<=s/2;m++){
        n=1; a=head; b=head;
        while(n<m){
          a=a.next;
          n++;
        }
        n=m;
        while(s-n>0){
          b=b.next;
          n++;
        }
        if(a.data!=b.data)
        {flag=1;break;}
      }
    }
    if(flag==0)
      return 1;
    else
      return 0;
  }
}