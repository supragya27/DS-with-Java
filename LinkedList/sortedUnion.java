/* class Node
{
  int data;
  Node next;
} */

static Node findUnion(Node head1, Node head2) 
{
  if(head1==null&&head2==null)
    return null;
   Node n1=head1,n2=head2,nH=null,nL=null; int a,b,s=0,f=0,sm=0,ps=0,lg=0;
  
  while(n1!=null){s++;n1=n1.next;}while(n2!=null){s++;n2=n2.next;}
  n1=head1;n2=head2;
  while(n1!=null){
    if(n1.data>lg)
      lg=n1.data;
    n1=n1.next;
  }
  while(n2!=null){
    if(n2.data>lg)
      lg=n2.data;
    n2=n2.next;
  } 
  
  for(a=0;a<s;a++)
  {    
    n1=head1;n2=head2;sm=lg;
    while(n1!=null)
    { 
      if(n1.data<sm&&n1.data>ps)
        sm=n1.data;
      n1=n1.next;
    }  
    while(n2!=null)
    {
      if(n2.data<sm&&n2.data>ps)
        sm=n2.data;
      n2=n2.next;
    }
    if(sm!=ps){
    if(f==0){
      nH=new Node(sm);
      nL=nH;f=1;
    }
    else{
      nL.next=new Node(sm);
      nL=nL.next;
    }}
    ps=sm;
    
 
    
  }
  return nH;
}