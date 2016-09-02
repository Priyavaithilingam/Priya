import java.io.*;
import java.util.*;
class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,sum=0;
for(i=1;i<=n;i=i+2)
{
  sum+=i;
}
System.out.println(sum);
}
}