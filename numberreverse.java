import java.io.*;

import java.util.*;

public class numberreverse
 
{

public static void main(String args[])

{
int n,a,s=0;
Scanner in = new Scanner(System.in);
      
n = in.nextInt();
while(n!=0)
{
a=n%10;
s=s*10+a;
n=n/10;

}
System.out.println(s);

}
}
