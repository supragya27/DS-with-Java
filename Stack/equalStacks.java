import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        int w1=0,w2=0,w3=0,fh=0,p;
        for(int i=h1.length-1;i>=0;i--)
        {
        s1.push(h1[i]);
        w1+=h1[i];
        }
        for(int i=h2.length-1;i>=0;i--)
        {
        s2.push(h2[i]);
        w2+=h2[i];
        }
        for(int i=h3.length-1;i>=0;i--)
        {
        s3.push(h3[i]);
        w3+=h3[i];
        }
        
        while((!s1.isEmpty())&&(!s2.isEmpty())&&(!s3.isEmpty()))
        {
            fh=Math.min(w1,Math.min(w2,w3));
            while(w1>fh&&w1>0)
            {
                p=s1.pop();
                w1-=p;
            }
            while(w2>fh&&w2>0)
            {
                p=s2.pop();
                w2-=p;
            }
            while(w3>fh&&w3>0)
            {
                p=s3.pop();
                w3-=p;
            }
            if((w1==w2)&&(w2==w3))
            break;
        }
        fh=Math.min(w1,Math.min(w2,w3));
        return fh;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}