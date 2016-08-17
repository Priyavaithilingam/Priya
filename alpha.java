import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int i=0,j=0,k=0,h=0;
char temp=' ';
String a[]=s.split(" ");
for(i=0;i<a.length;i++)
{
 char c[]=a[i].toCharArray();
 for(j=0;j<c.length;j++)
 {
  for(k=j+1;k<c.length;k++)
  {
   if((c[j]>=65&&c[j]<=91)||(c[j]>=97&&c[j]<=123)||(c[k]>=65&&c[k]<=91)||(c[k]>=97&&c[k]<=123))
   {
    if(c[j]>c[k])
    {
    temp=c[j];
    c[j]=c[k];
    c[k]=temp;
    }
   }
   else if(c[j]>=48&&c[j]<=56)
     continue;
  }
 }
 for(h=0;h<c.length;h++)
 {
  System.out.print(c[h]);
 }
 System.out.print(" ");
}
}
}
 
