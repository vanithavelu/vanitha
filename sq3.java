import java.io.*;
import java.util.*;
class sq3
{
public static void main(String args[])
{
int n,d,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
 d=sc.nextInt();
int[] a=new int[100];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]!=d)
{
System.out.print(a[i]);
}
}
}
}
