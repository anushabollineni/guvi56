import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="helloword.123";
String num=".*[0-9].*";
String alphabets=".*[a-z].*";
if(s.matches(num)&&s.matches(alphabets))
{
System.out.println("valid"  +s);
	}
System.out.println("yes");
}
}
