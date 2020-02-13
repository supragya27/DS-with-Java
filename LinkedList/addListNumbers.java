/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */

class Result {
  static Node addListNumbers(Node head1, Node head2) {
    if(head1==null&&head2==null)
      return null;
  int a=10,flag=0,no1=0,no2=0;
    Node dig=head1;
    while(dig!=null){
      if(flag==0)
      {
        no1=dig.data;dig=dig.next;flag=1;
      }
      else{
        no1=(no1*10)+dig.data; dig=dig.next;
      }
    }flag=0; dig=head2;
     while(dig!=null){
      if(flag==0)
      {
        no2=dig.data;dig=dig.next;flag=1;
      }
      else{
        no2=(no2*10)+dig.data; dig=dig.next;
      }
    }
    int No1=0,No2=0;
    while(no1>0){
      No1=(No1*10)+(no1%10);no1/=10;
    }
    while(no2>0){
      No2=(No2*10)+(no2%10);no2/=10;
    }
    int sum=No1+No2;
    Node nH=new Node(sum%10);
    Node nL=nH;sum/=10;
    while(sum>0){
      nL.next=new Node(sum%10);
      nL=nL.next;sum/=10;
    }
    return nH;
    
  }
}