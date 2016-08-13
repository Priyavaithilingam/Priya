import java.io.*;
import java.util.*;
class Fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
int i;
for(i=1;n!=0;i++)
{
  f=f*i;
  n=n-1;
}
System.out.println(f);
}
}