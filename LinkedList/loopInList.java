class Result {
  static int loopInList(Node head) {
      int size=1,finite=0,a,lc=1;
    if(head==null)
      return 0;
    Node rtLim=head.next,ltNd,temp; 
    d:
    while(rtLim!=null)
    {
      ltNd=head;
      for(a=1;a<=size;a++){
        if(ltNd==rtLim)
        {
          temp=ltNd.next;
          while(temp!=ltNd){
            lc++; temp=temp.next;}
          break d;
        }
        ltNd=ltNd.next;
      }
      rtLim=rtLim.next;
      if(rtLim==null)
        finite =1;
      size++;
    }
    if(finite==1)
      return 0;
    return lc;
  }
}