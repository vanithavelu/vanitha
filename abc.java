import java.io.*;
import java.util.*;
public class abc
{
public static void main(String args[])
{
int i,j;
String s;
String s1;
Scanner sc=new Scanner(System.in);
s=sc.next();
s1=sc.next();
int n=s.length();
int n1=s1.length();
if(s.contains(s1)==true)
{
System.out.println(n1);
}
else 
{
System.out.println("-1");
}
}
}
