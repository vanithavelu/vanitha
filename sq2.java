import java.io.*;
import java.util.*;
class sq2
{
public static void main(String args[])
{
int n,i,j=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int d=sc.nextInt();
String s=String.valueOf(n);
int n1=s.length();
StringBuffer sb=new StringBuffer(s);
String s2=sb.substring(0,d);
String s3=sb.substring(d,n1);
System.out.print(s3);
System.out.print(s2);
}
}



