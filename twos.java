import java.io.*;
import java .util.*;
public class twos
{
public static void main(String args[])
{
int n,i,s,count=0,a;
Scanner in = new Scanner(System.in);
      

n = in.nextInt();

for(i=1;i<=n;i++)
{
s=i;
while(s!=0)
{
a=s%10;
if(a==2)
{
count++;
}
s=s/10;
}
}
System.out.println(count);
}}


