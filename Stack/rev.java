static String reverseString(CQStack s, String st)
{
  for(int a=0;a<st.length();a++){
   s.push(st.charAt(a));
  }
  String str=""; char c;
  for(int a=0;a<st.length();a++){
    c=(char)s.pop();
    str+=c;
  }
  
return str;
}