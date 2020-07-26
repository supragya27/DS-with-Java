import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        int arr[][]=new int[n][n];
        while(m-->0)
        {
            int a=s.nextInt(),b=s.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
        m=s.nextInt();
        while(m-->0)
        {
            int a=s.nextInt(),b=s.nextInt();
            if(arr[a][b]==1)
            System.out.println("YES");
            else
            System.out.println("NO");
        }

    }
}