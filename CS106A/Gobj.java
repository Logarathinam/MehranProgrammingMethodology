import acm.program.*;
import acm.graphics.*;
public class Gobj extends GraphicsProgram{
	public void run(){
       GImage img=new GImage("C:/Users/Ext03621/Desktop/signify.png");
       add(img,0,0);
       int width=350;
       int height=200;
       GPolygon diamond=new GPolygon();
       diamond.addVertex(-width/2 ,0);
       diamond.addVertex(0,-height/2);
       diamond.addVertex(width/2,0);
       diamond.addVertex(0,height/2);
       add(diamond,getWidth()/2,getHeight()/2);
       
       
	}
}
