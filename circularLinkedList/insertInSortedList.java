/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList insertSorted(LinkList head, int data) {
    if(head==null){
      head=new LinkList(data);
      head.next=head;
      return head;
    }
   LinkList cN=head,cN2=head,temp,pN=head;int f=0;
    while(cN!=null){
      if(cN.data>data&&cN==head){
        while(cN2.next!=head){
          cN2=cN2.next;
        }
        temp=new LinkList(data);
        temp.next=head;
        cN2.next=temp;
        head=temp;
       
        break;
      }
      else if(cN.next==head){
        if(cN.data>data){
        temp=new LinkList(data);
        pN.next=temp;
        temp.next=cN;
        break;}
        else{
        cN.next=new LinkList(data);
        cN.next.next=head;
        break;}
      }
      else if(cN.data>data){
        temp=new LinkList(data);
        temp.next=cN;
        pN.next=temp;
        break;
      }
      if(f==1)
        pN=pN.next;
      f=1; cN=cN.next;
    }
    return head;
    
  }
}