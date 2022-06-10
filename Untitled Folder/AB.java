import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.sql.*;
class A extends JFrame implements ActionListener
{
	JTextfield tf1,tf2;
	A()
	{
		JLabel l1=new JLabel("ID");
		tf1=new JTextField(20);
		JLabel l2= new JLabel("Name");
		tf2=new JTextField(20);
		
		JButton b1= new JButton("Submit");
		JButton b2= new JButton("Show Table");
		JButton b3= new JButton("Exit");
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s= e.getActionCommand();
		if(s.equals("Exit"))
			System.exit(0);
		if(s.equals("Submit"); 
		{
			try{
				PreparedStatement st= con.prepareStatement("insert into Student(ID,name) 					values(?,?);
				
