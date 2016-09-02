import java.io.*;

import java.util.*;

public class reverse
 
{

public static void main(String args[])

{

String s;

Scanner in = new Scanner(System.in);
      
s = in.next();
  
StringBuffer s1=new StringBuffer(s);   
s1.reverse();

System.out.println(s1);

}

}
