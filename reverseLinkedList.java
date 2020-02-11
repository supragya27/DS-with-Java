/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d; next=null;
  }
} */
class Result {
  static Node reverseList(Node head) {
    if(head==null)
      return null;
    Node cN=head; int size=1;
    while(cN.next!=null){
      cN=cN.next;size++;}
    int s2=size;
    Node nH=new Node(cN.data);
    Node nL=nH;
    cN=head;
    int b=0;
    while(s2>1){cN=head;
    for(int a=0;a<size-2-b;a++)
    {cN=cN.next; 
    } nL.next=new Node(cN.data);nL=nL.next;
    b++;s2--;
    }
    return nH;
    
    

  }
}