import java.io.*;
import java.util.*;
class seed
{
public static void main(String args[])
{
int n,a,m=1,p;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
p=n;
while(n!=0)
{
a=n%10;
m=m*a;
n=n/10;
}
int x=m*p;
System.out.println("the" +p+"is the seed of"+x);
}
}
