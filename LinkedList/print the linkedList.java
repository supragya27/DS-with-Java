static void forwardPrint(Node head)
{
Node cNode=head;
  while(cNode!=null)
  {
    System.out.print(cNode.data+"-");
    cNode=cNode.next;
  }
  
}

static void backwardPrint(Node head)
{
  if(head==null)
  {
    return;
  }
Node cNode=head;
  
	if(cNode!=null)  
    {backwardPrint(cNode.next);
    System.out.print(cNode.data+"-");}
  	else{return;}  
  
}