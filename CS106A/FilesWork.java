import java.io.*;
import java.util.*;
import acm.program.*;

public class FilesWork extends ConsoleProgram{

	//Opening the File->Buffered Reader & FileReader
	//readFile
	//close the File
	//PrintWriter & FileWrite
	public void run()
	{
		try{
	     BufferedReader rd =new BufferedReader(new FileReader("testFile.txt"));
	     while(true)
	     {
	    	 String line=rd.readLine();
	    	 if(line==null)
	    	 {
	    		 break;
	    	 }
	    	 System.out.println(line);
	     }
		}
		catch(IOException e)
		{
			System.out.println("File not Found"+e);
		}
	}
}
