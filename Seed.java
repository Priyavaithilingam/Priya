import java.io.*;
import java.util.*;
class Seed
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n;
    int r;
    int s=1;
    while(a>0)
    {
      r=a%10;
      s=s*r;
      a=a/10;
    }
    int seed=n*s;
    System.out.println(seed);
  }
}
      
      