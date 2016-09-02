import java.io.*;
import java.util.*;
public class character 
{
public static void main(String args[])
{
char c;
Scanner in = new Scanner(System.in);
      c = in.nextChar();
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
System.out.println("given character is vowel");
}
else
{
System.out.println("given character is constant");
}
}
}

