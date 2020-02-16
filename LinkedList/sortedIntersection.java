/* class Node {
  int data;
  Node next;
  Node(int d) {
    data=d;
  }
} */
class Result {
  static Node findIntersection(Node head1, Node head2) {
      Node n1=head1,n2=head2,nH=null,nL=null; int f=0;
    if(head1==null&&head2==null){
      return null;
    }
    while(n1!=null){
      n2=head2;
      while(n2!=null)
      {
        if(n1.data==n2.data)
        {
          if(f==0)
          {
            nH=new Node(n1.data);f=1;nL=nH;
          }
          else
          {
            nL.next=new Node(n1.data);
            nL=nL.next;
          }
        } 
        n2=n2.next;
      }
         n1=n1.next;
    }
    return nH;
  }
}