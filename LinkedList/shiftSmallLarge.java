/* class Node
{
  int data;
  Node next;
} */


static Node shiftSmallLarge(Node org)
{
  if(org==null)
    return null;
   Node a=org,pN;
  int sm=org.data,lg=org.data;
  while(a!=null){
    if(a.data<sm)
      sm=a.data;
    if(a.data>lg)
      lg=a.data;
    a=a.next;
  }
  if(org.data!=sm){
    pN=org;a=org.next;
    while(a.data!=sm){
      a=a.next;pN=pN.next;
    }
    pN.next=a.next;
    a.next=org;
    org=a;
  }
  a=org;
  while(a.next!=null)
    a=a.next;
  if(a.data!=lg){
    pN=org;a=org.next;
    while(a.data!=lg){
      a=a.next;pN=pN.next;      
    }
    pN.next=a.next;a.next=null;
    while(pN.next!=null)
      pN=pN.next;
    pN.next=a;
  }
  return org;
  
}