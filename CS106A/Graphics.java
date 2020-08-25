import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class Graphics extends GraphicsProgram{
	public void run(){
      GLabel lab=new GLabel("Hello,World",50,50);
      lab.setColor(Color.RED);
      GRect rect=new GRect(10,10,30,50);
      GOval ova=new GOval(30,30,10,10);
      ova.setColor(Color.RED);
      rect.setFilled(true);
      add(lab);
      add(rect);
      add(ova);
      
	}
}
