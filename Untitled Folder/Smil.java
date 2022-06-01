import javax.swing.*;
import java.awt.*;
class AB extends Canvas
{ 
	
	public void paint(Graphics g)
	{
		g.drawOval(67,67,50,50); 
		g.setColor(Color.red);
		g.fillOval(67,67,50,50);
		g.setColor(Color.black); 

		g.drawOval(385,67,50,50);
		g.setColor(Color.red);
		g.fillOval(385,67,50,50);
		g.setColor(Color.black);

		g.drawOval(50,50,400,400); 
		g.setColor(Color.yellow);
		g.fillOval(50,50,400,400);
		g.setColor(Color.black);

		g.drawOval(140,140,50,50);
		g.setColor(Color.white);
		g.fillOval(140,140,50,50);
		g.setColor(Color.black);

		g.drawOval(300,140,50,50);
		g.setColor(Color.white);
		g.fillOval(300,140,50,50);
		g.setColor(Color.black);

		g.drawLine(240,200,240,300);
		g.drawArc(145,200,200,200,0,-180);

	} 
	public static void main(String args[])
	{
		AB a=new AB();
		JFrame f=new JFrame();  
        	f.add(a);  
        	f.setSize(400,400);  
        	f.setVisible(true);  
	}
}
