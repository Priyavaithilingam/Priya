import java.io.*;
import java.util.*;
class String1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++)
{
 if(i==1)
 {
  if(s1.charAt(1)>=97&&s1.charAt(1)<=123)
  {
    char a=s1.charAt(1);
   int c=(int)a;
   char b=(char)(c-32);
   sb.append(b);
  }
}
else
{
    sb.append(s1.charAt(i));
}
}
System.out.println(sb);
}
}