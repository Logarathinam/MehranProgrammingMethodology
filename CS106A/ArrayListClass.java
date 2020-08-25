import java.util.*;
import acm.program.*;
public class ArrayListClass extends ConsoleProgram {
	
	public void run()
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(5);
	al.add(7);
	al.add(8);
	al.add(0,14);
	al.remove(7);
	
	println(al);
	}
}
