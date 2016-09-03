import java.io.*;
import java.util.*;
class collection
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
int i;
int s2=s1.length();
char[] c=s1.toCharArray();
Set o = new HashSet();
for(i=0;i<s2;i++)
{
o.add(c[i]);
}
System.out.println(o);
}
}
