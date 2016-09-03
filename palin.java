import java.io.*;
import java.util.*;
public class palin 
{
public static void main(String args[])
{
int n,a,s=0;
Scanner in = new Scanner(System.in);
      n = in.nextInt();
while(n!=0)
{
a=n%10;
s=s+a;
n=n/10;
}
System.out.println("sum value is");
System.out.println(s);
if(n==s)
{
System.out.println("given num is palindrome");
}
else
{
System.out.println("given number is not a palindrome");
}
}
}
