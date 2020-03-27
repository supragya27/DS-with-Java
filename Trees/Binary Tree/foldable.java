import java.util.*;
class Result {
  static int isFoldable(Node root) {
   if(root==null)
     return 1;
    int f=1;
    Stack<Node> ls=new Stack<>();
    Stack<Node> rs=new Stack<>();
    Node lcn=root.leftChild,rcn=root.rightChild;
    m:
    while(((!ls.isEmpty())&&(!rs.isEmpty()))||(lcn!=null&&rcn!=null))
    {
      while(lcn!=null&&rcn!=null)
      {
        ls.push(lcn); rs.push(rcn);
        lcn=lcn.leftChild; rcn=rcn.rightChild;
        
        if((lcn==null&&rcn!=null)||(lcn!=null&&rcn==null))
        {f=0;break m;}
      }
      lcn=ls.pop();rcn=rs.pop();
      lcn=lcn.rightChild;rcn=rcn.leftChild;
      
        if((lcn==null&&rcn!=null)||(lcn!=null&&rcn==null))
        {f=0;break m;}
    }
    
    
    return f;
  }
}