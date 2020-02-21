/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */
class Result {
  static LinkList removeDupsDLL(LinkList head) {
        if (head==null)
          return null;
    LinkList cN=head;
    while(cN!=null){
      if((cN.next!=null)&&(cN.data==cN.next.data))
        cN.next=cN.next.next;
      else
      cN=cN.next;
    }
    return head;
  }
}