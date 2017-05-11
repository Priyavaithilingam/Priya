import java.util.*;
import java.io.*;
class Sum
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   StringBuffer sb=new StringBuffer();
   int a=sc.nextInt();
   int s=0;
   String s1;
   while(a>0)
  {
    s+=a%10;
    a=a/10;
  }
  if(s<10)
  {
    s1=Integer.toString(s);
    sb.append("0");
    sb.append(s1);
  }
  else
 {
   s1=Integer.toString(s);
    sb.append(s1);
 }
  sb.reverse();
  String s2=sb.toString();
  if(s1.equals(s2))
  {
    System.out.println("Is Palindrom");
  }
  else
 {
   System.out.println("Is not palindrom");
 }

}
}