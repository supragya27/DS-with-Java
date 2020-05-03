public static Node insert(Node root,int data) {
           if(root==null)  
          root=new Node(data);
          else
          {
              Node cN=root;
              while(true)
              {
                  if(cN.data>data&&cN.left==null)
                  break;                  
                  if(cN.data<data&&cN.right==null)
                  break;
                  if(data>cN.data)
                  cN=cN.right;
                  else
                  cN=cN.left;
              }              
              if(data<cN.data)
              {
              cN.left=new Node(data);
              }
              else
              cN.right=new Node(data);
              
           }

          return root;
    	
    }