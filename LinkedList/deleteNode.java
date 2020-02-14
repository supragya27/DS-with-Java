/* class Node {
  int data;
  Node next;
  Node() {}
  Node(int d) {
    data=d;
  }
} */

class Result {
  static void deleteNodeK(Node n1) {
           if((n1==null)||(n1.next==null))
             return;    
    Node cN=n1;
    while(cN.next!=null){
      cN.data=cN.next.data;
      cN=cN.next;
    }
   cN=n1;
     while(cN.next.next!=null){
      cN=cN.next;
    }cN.next=null;
    return;
  }
}