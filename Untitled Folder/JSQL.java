import java.sql.*;
class A
{
	public static void main(String args[])
	{
		Connection con=null; 
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Access Granted!!!!!!!!");
			}
			catch(Exception e)
			{
				System.out.println("Driver not Found"); 
			}
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse?autoReconnect=true&useSSL=false","root","gehu");	 
			System.out.println("Connection Established!!!!!!!!");
			}
		catch(Exception e)
		{
			System.out.println("Connection Error");
		}  
		System.out.println("Entering the Records");
		try{
			Statement st=con.createStatement();
			st.executeUpdate("insert into Student(Roll_No,Name) values(01,'Ambuj Bhandari')");
			st.executeUpdate("insert into Student(Roll_No,Name) values(02,'Divyanshu negi')");
			st.executeUpdate("insert into Student(Roll_No,Name) values(03,'Abhishek Rana ')"); 
	
			System.out.println("Fetching the records:");
			rs= st.executeQuery("select * from Student");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			} 
			System.out.println("Modifying The records:");
			st.executeUpdate("update Student set Name='Ambuja Cement' where Roll_No=01");  
			System.out.println("Record Modified!!!!\n");
			rs= st.executeQuery("select * from Student");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			}  
			System.out.println("\nDeleting The records:");
			st.executeUpdate("delete from Student where Roll_No=03");  
			System.out.println("Record Deleted!!!!\n");
			rs= st.executeQuery("select * from Student");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			}  
			
		}
		catch(Exception e)
		{
			System.out.println("Statement Issues!!!");
		}
		
	}
}
