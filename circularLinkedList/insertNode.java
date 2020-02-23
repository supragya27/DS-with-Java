/* class LinkList
{
  int data;
  LinkList next;
  LinkList(int d)
  {
    data=d;
  }
} */

static LinkList insertBeg(LinkList head, int data)
{
  if(head==null){
  head=new LinkList(data);
    head.next=head;
    return head;
  
  }
LinkList cN=head;
  while(cN!=null){
    if(cN.next==head)
      break;
    cN=cN.next;
  } cN.next=new LinkList(data);
  cN.next.next=head;
  head=cN.next;
  return head;
}
static LinkList insertEnd(LinkList head, int data)
{
  if(head==null)
     {head=new LinkList(data);
    head.next=head;
    return head;}
LinkList cN=head;
  while(cN!=null){
    if(cN.next==head)
      break;
    cN=cN.next;
  } cN.next=new LinkList(data);
  cN.next.next=head;
  cN=head;
  return head;
}