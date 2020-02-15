import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        char arr2[]={'C','A','R','T'};
        char arr1[]={'M','A','R','C','H'};
        int res[][]=new int[arr2.length+1][arr1.length+1];
        for(a=0;a<res.length;a++){
            res[a][0]=a;
        }
        for(a=0;a<res[0].length;a++){
            res[0][a]=a;
        }
        for(a=1;a<res.length;a++){
            for(b=1;b<res[0].length;b++){
                if(arr2[a-1]==arr1[b-1]){
                    res[a][b]=res[a-1][b-1]+1;
                }
                else{
                    if(res[a-1][b]<res[a][b-1])
                    res[a][b]=res[a-1][b];
                    else
                    res[a][b]=res[a][b-1];
                    
                }
            }
        }


        for(a=0;a<res.length;a++){
            for(b=0;b<res[0].length;b++){
                System.out.print(res[a][b]+" ");
            }
            System.out.println();
        }
    }
    }