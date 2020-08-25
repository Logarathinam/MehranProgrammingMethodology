import java.util.*;
public class AllAboutStrings {
public static void main(String[] args)
{
	String line="Hello, World";
	StringTokenizer token=new StringTokenizer(line,", ");
	System.out.println(token);
	System.out.println(token.hasMoreTokens());
	if(token.hasMoreTokens())
	{
		System.out.println(token.nextToken());
	}
}
}
