import java.io.*;
import java.util.*;
class Small
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[20];
   int i,j,t;
   for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
   }
   for(i=0;i<n;i++)
   {
     for(j=i+1;j<n;j++)
     {
        if(a[i]>a[j])
        {
          t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
     }
   }
   System.out.println("The 2nd Smallest element is"+" "+a[1]);
}
}