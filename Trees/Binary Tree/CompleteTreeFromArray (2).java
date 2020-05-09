static Node buildTree(int t[], int n)
{
  Node node = null;
  node=insertLevelOrder(t,node,0);

  return node;
}
static Node insertLevelOrder(int[] arr, Node root, 
                                                int i) 
    { 
        if (i < arr.length) { 
            Node temp = new Node(arr[i]); 
            root = temp; 
  
            root.leftChild = insertLevelOrder(arr, root.leftChild, 
                                             2 * i + 1); 
  
            root.rightChild = insertLevelOrder(arr, root.rightChild, 
                                               2 * i + 2); 
        } 
        return root; 
    }