boolean checkBST(Node root) {
        int ans=1;
       Queue<Integer> q=new LinkedList<>();
       pre(root,q);
       while(!q.isEmpty())
       {
           int a=q.remove();
           if(!q.isEmpty())
           {
               if(a>=q.peek())
               {ans=0;
               break;}
           }
       }
        if(ans==1)
            return true;
        return false;
    }
   void pre(Node root,Queue<Integer> q)
   {
      if(root==null)
      return;

      pre(root.left,q);
      q.add(root.data)  ;
      pre(root.right,q);
}