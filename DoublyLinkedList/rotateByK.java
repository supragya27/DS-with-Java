/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

static LinkList rotateByK(LinkList head, int k)
{
  if(head==null)
    return null;
  LinkList cN; int temp;
    while(--k>=0){
      cN=head;
      while(cN.next!=null)
        cN=cN.next;
      temp=cN.data;
      while(cN.prev!=null){
        cN.data=cN.prev.data;
        cN=cN.prev;
      }
      cN.data=temp;
    }
  return head;
}