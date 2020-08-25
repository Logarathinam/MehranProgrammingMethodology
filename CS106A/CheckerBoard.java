import acm.program.*;
import java.util.*;
import acm.graphics.*;
public class CheckerBoard extends GraphicsProgram{
	
	private static final int rows=8;
	private static final int cols=8;
	
	public void run()
	{
		int CanvasHeight=getHeight();
		//println(CanvasHeight);
		int sqsize=CanvasHeight/rows;
		
		for(int i=0;i<rows;i++)
		{
		     for(int j=0;j<cols;j++)
		     {
		    	 int x=i*sqsize;
		    	 int y=j*sqsize;
		    	 GRect sq=new GRect(x,y,sqsize,sqsize);
		    	 sq.setFilled((i+j)%2!=0);
		    	 add(sq);
		     }
		}
	}

}
