import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();        
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        al.add(new ArrayList<Integer>());
        while(m-->0)
        {
            int a=s.nextInt(),b=s.nextInt();
            al.get(a).add(b);
            al.get(b).add(a);
        }
        m=s.nextInt();
        while(m-->0)
        {
            int a=s.nextInt(),b=s.nextInt();
            if(al.get(a).contains(b))
            System.out.println("YES");
            else
            System.out.println("NO");
        }

    }
}