import java.util.*;
public class Main {
	static boolean checkParanthesis(String str)
	{
  int flag=0;

Stack<Character> st=new Stack<Character>();
for(int i=0;i<str.length();i++){
  
  if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
    st.push(str.charAt(i));
  else if((str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')&&(st.empty()==true))
  {flag=1;break;}
   else if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')
  {if((st.peek()=='('&&str.charAt(i)==')')||(st.peek()=='{'&&str.charAt(i)=='}')||(st.peek()=='['&&str.charAt(i)==']'))
    st.pop();
   else{flag=1; break;}
  }
}
if(flag==1||(st.empty()==false))
return false;
else
  return true;
  }
	public static void main(String[] args) {
		int n;
		String str;
		Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(int i=0;i<n;i++)
		{
			str=sc.next();
			if(checkParanthesis(str))
			{
				System.out.println("Balanced");
			}
			else
			{
				System.out.println("Unbalanced");
			}
	    }
    }}