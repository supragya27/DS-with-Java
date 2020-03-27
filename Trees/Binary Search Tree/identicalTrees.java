/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
class Result {
  static int res=1;
  static int areSameTree(Node t1, Node t2) {
    if(t1==null&&t2==null)
      return res;
    
      if((t1==null&&t2!=null)||(t1!=null&&t2==null))
        res=0;
    else if(t1.data!=t2.data)
      res=0;
    if(res==1)
    {
      areSameTree(t1.leftChild,t2.leftChild);
      areSameTree(t1.rightChild,t2.rightChild);
    }
    return res;
  }
}