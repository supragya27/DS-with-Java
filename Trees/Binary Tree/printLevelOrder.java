static void printLevelOrder(Node root) 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i); System.out.println();}
    } 
    static int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            int lheight = height(root.leftChild); 
            int rheight = height(root.rightChild); 
              
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
    static void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data ); 
        else if (level > 1) 
        { 
            printGivenLevel(root.leftChild, level-1); System.out.print(" ");
            printGivenLevel(root.rightChild, level-1); 
        } 
    } 
static void printLevelWise(Node root)
{
printLevelOrder(root);
}