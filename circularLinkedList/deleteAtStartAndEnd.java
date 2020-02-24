/* class LinkList
{
  int data;
  LinkList next;
} */

static LinkList deleteBeg(LinkList head)
{
  if(head==null){
    return null;
  }
  LinkList cN=head;
  while(cN!=null){
    if(cN.next.next==head)
      break;
    cN=cN.next;
  }
  cN.next=head.next;
  head=head.next;
  return head;
}
static LinkList deleteEnd(LinkList head)
{
  if(head==null)
    return null;
  LinkList cN=head;
  while(cN!=null){
    if(cN.next.next==head)
      break;
    cN=cN.next;
  }
  cN.next.next=head;
  return head;
}