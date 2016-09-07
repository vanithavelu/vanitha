import java.io.*;
import java.util.*;
class rect
{
public static void main(String args[])
{
int x1,y1,x2,y2,a1,b1,a2,b2;
Scanner sc=new Scanner(System.in);
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();
a1=sc.nextInt();
b1=sc.nextInt();
a2=sc.nextInt();
b2=sc.nextInt();
if(((x1<a1)&&(x1>a2)||(x2<a2)&&(x2>a1))&&((y1<b1)&&(b2>y1))||((y2<b2)&&(b1<y1)))
{
System.out.println("valid rectangle");
}
else
{
System.out.println("invalid rectangle");
}
}
}

