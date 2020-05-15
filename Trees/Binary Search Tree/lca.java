/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
        if(root==null)
        return null;
        int ht1=0,ht2=0;
        Stack <Node> s1=new Stack<>();
        Stack <Node> s2=new Stack<>();
        Node cN1=root,cN2=root;
        s1.push(root);s2.push(root);
        while(cN1.data!=v1)
        {
            if(v1<cN1.data)
            {
                cN1=cN1.left; 
            }
            else
            {
                cN1=cN1.right; 
            }
            ht1+=1;
            s1.push(cN1);
        }
        while(cN2.data!=v2)
        {
            if(v2<cN2.data)
            {
                cN2=cN2.left; 
            }
            else
            {
                cN2=cN2.right; 
            }
            ht2+=1;
            s2.push(cN2);
        }
        if(cN1==cN2)
        return cN1;
        else
        {
            while((!s1.isEmpty())&&(!s2.isEmpty()))
            {
                if(s1.peek()==s2.peek())
                return s1.pop();
                else
                {
                    if(ht1>=ht2)
                    {
                        s1.pop();ht1--;
                    }
                    else
                    {
                        s2.pop();ht2--;
                    }
                }
            }
        }
        return root;

    }