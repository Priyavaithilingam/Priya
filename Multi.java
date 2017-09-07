import java.io.*;
import java.util.*;
class Multi
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    long i=Integer.parseInt(s1);
    long j=Integer.parseInt(s2);
    if(i>0&&j>0)
    {
      long f=i*j;
      String s3=String.valueOf(f);
      System.out.println(s3);
    }
    else
    {
      System.out.println("Not vaild Input");
    }
  }
}
