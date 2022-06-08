import java.sql.*;
class A
{
	public static void main(String args[])
	{
		Connection con=null;
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
		try{
			Statement st=con.createStatement();
			//st.executeUpdate("insert into ambuj(id,name) values(2,'Divyanshu')");
			ResultSet rs=st.executeQuery("select * from ambuj");
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
