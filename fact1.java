import java.io.*;
import java.util.*;
public class fact1
{
public static void main(String args[])
{
int i,j,k,fact=1,count=0;
Scanner in = new Scanner(System.in);
 int n = in.nextInt();

for(k=1;k<n;k++)
{
fact=fact*k;
}
System.out.println(fact);
String ss=String.valueOf(fact);
int n1=ss.length();
String o="0";
char[] c=ss.toCharArray();
if(ss.contains(o)==true)
{
System.out.println(ss);
for(i=n1;i>=1;i--)
{
if(c[i]==o)
{
count++;
}
}
System.out.println(count);
}
}
}
