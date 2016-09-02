import java.io.*;
import java.util.*;
class Palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
String s2=sb.toString();
char[] a={'a','e','i','o','u'};
int i,j,c=0;
if(s1.equals(s2))
{
  for(i=0;i<s1.length();i++)
  {
   for(j=0;j<s2.length();j++)
   {
      if(s1.charAt(i)==a[j])
      {
         c++;
         s1=s1.replace(s1.charAt(i),'*');
      }
    }
  }
  if(c>=2)
  {
    System.out.println("True");
  }
  else
  {
    System.out.println("False");
   }
}
else
{
   System.out.println("False");
}
}
}
 