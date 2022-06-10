import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class A extends JFrame implements ActionListener
{
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	A()
	{
		JLabel l1=new JLabel("Nunmber 1:");
		tf1=new JTextField(20);

		JLabel l2=new JLabel("Nunmber 2:");
		tf2=new JTextField(20);

		JButton b1=new JButton("Sum");
		JButton b2=new JButton("Subtract"); 
		JButton b3=new JButton("Multiply");
		JButton b4=new JButton("Divide"); 
		JButton b5=new JButton("Exit"); 

		JLabel l3=new JLabel("Result: ");
		tf3=new JTextField(20);  

		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l3);
		add(tf3); 

		b1.addActionListener(this);
		b2.addActionListener(this); 
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	} 
	public void actionPerformed(ActionEvent e)
	{ 
		int r=0;
		String s=e.getActionCommand();
		if(s.equals("Sum"))
		r=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText()); 
	
		if(s.equals("Subtract"))
		r=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText()); 

		if(s.equals("Multiply"))
		r=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
	
		if(s.equals("Divide"))
		r=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText()); 

		if(s.equals("Exit"))
		{
		 System.exit(0);
		}
		
		tf3.setText(Integer.toString(r));
	}
	
	public static void main(String args[])
	{
		A a=new A();
		a.setSize(1920,1080);
		a.setVisible(true);
	}
}
