/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

static void swapNodes(LinkList head, int x, int y)
{
  if(head==null)
    return;
  
LinkList n1=null,n2=null,cN=head;
  while(cN!=null){
     if(cN.data==x)
     {n1=cN;}
     if(cN.data==y)
     {n2=cN;}
     if(n1!=null&&n2!=null)
       break;
    cN=cN.next;
  }
  if(n1==null||n2==null)
    return;
  int temp=n1.data;
  n1.data=n2.data;
  n2.data=temp;
  return;
  
}