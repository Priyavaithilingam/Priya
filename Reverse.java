import java.io.*;
import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    StringBuilder sb1=new StringBuilder();
    int i;
    String s1=sc.nextLine();
    String[] s2=s1.split(" ");
    for(i=s2.length;i>0;i--)
    {
      sb1.append(s2[i-1]);
      sb1.append(" ");
    }
    System.out.println(sb1);
    
  }
}
    
    