import java.util.*;
class postFromPreIn
{
      int search(int in[],int root,int n)
     {
         for(int i=0;i<n;i++)
         if(root==in[i])
         return i;
         return -1;
     }
     void printPost(int pre[],int in[],int n)
     {
         int rootIdx=search(in,pre[0],n);

         if(rootIdx!=0)
         printPost(Arrays.copyOfRange(pre,1,n),in,rootIdx);

         if(rootIdx!=n-1)
         printPost(Arrays.copyOfRange(pre,rootIdx+1,n),Arrays.copyOfRange(in,rootIdx+1,n),n-rootIdx-1);

         System.out.print(pre[0]+" ");
     }
}
class Main
{
    public static void main(String[] args)
    {
        int[] pre={1,2,4,5,3,6};
        int[] in={4,2,5,1,3,6};
        postFromPreIn P=new postFromPreIn();
        P.printPost(pre,in,in.length);
        
    }
    }