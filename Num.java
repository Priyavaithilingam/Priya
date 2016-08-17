import java.io.*;
import java.util.*;
class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
StringBuffer sb1=new StringBuffer();
StringBuffer sb2=new StringBuffer();
int N=sc.nextInt();
int j=1;
sb.append(j);
System.out.print(sb);
for(int i=1;i<N;i++)
{
   sb1.append(sb);
   sb1=sb1.reverse();
    j++;
   sb.append(j);
   sb2.append(sb);
   sb2.append(sb1);
   System.out.print(" "+sb2);
   sb1.delete(0,sb1.length());
   sb2.delete(0,sb2.length());
}   
}
}