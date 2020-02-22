/* class LinkList
{
  int data;
  LinkList next;
} */

static int isCircular(LinkList head)
{
  if(head==null)
    return 1;
  LinkList cN=head; int f=0;
  while(cN!=null){
    if(cN.next==head)
      break;
    cN=cN.next;
    if(cN==null)
    {f=1;break;}
  }
  if(f==1)
    return 0;  //list is not circular
  else
    return 1;  //list is circular
}