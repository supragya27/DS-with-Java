/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

  static LinkList rearrangeList(LinkList head)
  {
    if (head==null)
      return null;
    int wc=0,c,n2,s=0,temp; LinkList cN=head;
    while(cN!=null){s++;cN=cN.next;}
    for(int n=1;n<=s;n++){
      cN=head;n2=n;
      while(--n2>0) cN=cN.next;
      c=0;
      if(n%2==0)
      {
        wc++;
        temp=cN.data;
        while(wc-c>0){
          cN.data=cN.prev.data;
          cN=cN.prev;
          c++;
        }
        cN.data=temp;
      }
    }
    return head;
  }