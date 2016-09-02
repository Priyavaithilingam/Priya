import java.io.*;
import java.util.*;
class Pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char s=sc.next().charAt(0);
String s1=sc.next();
String s2=sc.next();
int i,j,f=0;
for(i=0;i<s1.length();i++)
{
 for(j=0;j<s2.length();j++)
 {
   if(s1.charAt(i)==s2.charAt(j))
   {
       if(s1.charAt(i)==s)
      {
       if(i==j)
       {
         f++;
         break;
       }
       s1=s1.replace(s1.charAt(i),' ');
    }
  }
}
}
if(f>0)
{
  System.out.println("True");
}
else
{
  System.out.println("False");
}
}
}
