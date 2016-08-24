import java.io.*;
import java.util.*;
class Number
{
 static int l,i;
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
    l=s.length();
    i=Integer.parseInt(s);
   Number n=new Number();
   n.Power(i);
  } 
  public void Power(int j)
  {
    int m,o,sum=0,p;
    if(j>9)
    {
      while(j!=0)
     {
        m=j%10;
        j=j/10;
        o=1;
        p=1;
        while(o<=l)
        {
          p=p*m;
          o++;
        }
        sum+=p;
      }
    }
    System.out.println(sum);
 }
}