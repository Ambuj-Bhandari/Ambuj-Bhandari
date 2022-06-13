import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.sql.*; 
class A extends JFrame implements ActionListener
{
	JTextField tf1;
	JTextField tf2;
	Connection con=null;
	ResultSet rs;
	A()
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Access Granted!!!!!!!!");
		}
		catch(Exception e)
		{
			System.out.println("Driver not Found"); 
		}
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student?       autoReconnect=true&useSSL=false","root","gehu");	 
		System.out.println("Connection Established!!!!!!!!");
		}
		catch(Exception e)
		{
		     System.out.println("Connection Error");
		}  

		JLabel l1=new JLabel("ID ");
		tf1=new JTextField(20);

		JLabel l2=new JLabel("Name ");
		tf2=new JTextField(20);

		JButton b1=new JButton("Submit");
		JButton b2=new JButton("Show Table"); 
		JButton b3=new JButton("Exit"); 

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
		String s=e.getActionCommand();
		if(s.equals("Submit"))
		{ 
			try{
			   PreparedStatement ps=con.prepareStatement("insert into Record(Id,Name) values(?,?)");
			   ps.setInt(1,Integer.parseInt(tf1.getText()));
			   ps.setString(2,tf2.getText());  
			   ps.executeUpdate();
			  } 
			catch(Exception E)
			{
				System.out.println("Statement Realted issue!!!");
			}
		}
   		
		if(s.equals("Show Table")) 
		{   
			String data[][]=new String[20][2]; 
			int i=0;
			String col[]={"Id","Name"};  
			try{ 
			PreparedStatement ps2=con.prepareStatement("select * from Record");  
			rs= ps2.executeQuery(); 
			while(rs.next())
			{
				int r=rs.getInt(1);
				String st=rs.getString(2);  
				data[i][0]=Integer.toString(r);
				data[i][1]=st;
				i++;
				
			}  
			} 
			catch(Exception et)
			{
				System.out.println("Table error!!!");
			} 
			setLayout(new BorderLayout());
			JTable tab=new JTable(data,col);
			JScrollPane jp=new JScrollPane(tab);	
			add(jp,BorderLayout.SOUTH);
		} 
		if(s.equals("Exit"))
		{
			System.exit(0);
		}
			
	}
	
	public static void main(String args[])
	{
		A a=new A();
		a.setSize(1920,1080);
		a.setVisible(true);
	}
}
