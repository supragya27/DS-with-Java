static int ht=0;
	public static int getHeight(Node root){
        calcht(root,0);
        return ht;   
    }
    static void calcht(Node root, int h)
    {
        if(root==null)
        return;
        if(h>ht)  ht=h;
        calcht(root.left,h+1);
        calcht(root.right,h+1);
    }