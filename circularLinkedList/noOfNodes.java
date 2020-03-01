/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static int countNodes(LinkList head) {
if(head==null)
  return 0;
    LinkList cN=head; int s=0;
    while(cN!=null){s++;
      if(cN.next==head)
        break;
      cN=cN.next;
    }
    return s;
  }
}