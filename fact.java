import java.io.*;

import java.util.*;

public class fact
 
{

public static void main(String args[])

{
int n,i,a=1;
Scanner in = new Scanner(System.in);
      
n = in.nextInt();
for(i=1;i<=n;i++)
{
a=a*i;

}
System.out.println(a);

}
}
