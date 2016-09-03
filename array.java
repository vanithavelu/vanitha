import java.io.*;
import java.util.*;
class array
{
public static void main(String args[])
{
int i,j,k;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value");
int n = s.nextInt();
int a[]=new int[20];
System.out.println("values are:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
/*for(i=0;i<n;i++)
{
System.out.println(a[i]);
}*/
for(j=0;j<n;j++)
{
for(k=1;k<n;k++)
{
if(a[j]==a[k])
{
System.out.println(a[k]);
break;
}
}
}
}
}

