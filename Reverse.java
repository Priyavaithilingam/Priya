import java.io.*;
import java.util.*;
class Reverse
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 StringBuffer sb=new StringBuffer();
 String s1=sc.nextLine();
 sb.append(s1);
 sb=sb.reverse();
 System.out.println(sb);
 char[] a={'a','e','i','o','u'};
 int i,j;
 for(i=0;i<sb.length();i++)
 {
   for(j=0;j<a.length;j++)
   {
      if(sb.charAt(i)==a[j])
      {
        sb.deleteCharAt(i);
      }
   }
}
System.out.println(sb);
}
}
