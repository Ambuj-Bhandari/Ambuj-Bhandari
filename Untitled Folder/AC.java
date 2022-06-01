import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class AC extends JFrame implements ActionListener
{
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	AC()
	{
		JLabel l1=new JLabel("Nunmber 1:");
		tf1=new JTextField(20);

		JLabel l2=new JLabel("Nunmber 2:");
		tf2=new JTextField(20);

		JButton b1=new JButton("ADD");
		//JButton b2=new JButton("Subtract");

		JLabel l3=new JLabel("Result: ");
		tf3=new JTextField(20);  

		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		//add(b2);
		add(l3);
		add(tf3); 
		b1.addActionListener(this);
		//b2.addActionListner(this);
	} 
	public void actionperformed(ActionEvent e)
	{ 
		String s=Integer.toString(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText()));
		tf3.setText(s); 
	}
	public static void main(String args[])
	{
		AC a=new AC();
		a.setSize(1920,1080);
		a.setVisible(true);
	}
}
		

