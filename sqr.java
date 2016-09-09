import java.io.*;
import java.util.*;
class sqr
{
public static void main(String args[])
{
int x1,y1,x2,y2,x3,y3,x4,y4;
Scanner sc=new Scanner(System.in);
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();
x3=sc.nextInt();
y3=sc.nextInt();
x4=sc.nextInt();
y4=sc.nextInt();
if((x1>x2)&&(x3>x4)&&(y1<y3)&&(y2<y4)&&(x1==x3)&&(x2==x4)&&(y1==y2)&&(y3==y4))
{
if((x1-x2)==(x3-x4)&&(y1-y2)==(y3-y4))
{
System.out.println("given square values  are  valid");
}
else
{
System.out.println("given square values are valid");
}
}
}
}

