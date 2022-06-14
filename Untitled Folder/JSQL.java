import java.sql.*; 
import java.util.*;
class A
{
	public static void main(String args[])
	{  
        Scanner in= new Scanner(System.in);
        String s="";
        int r=0,ch=0;
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
		do
		{
        System.out.println("Enter\n1. To enter the records\n2.To fetch records from Table\n3. To modify the records\n4. To delete the records\n 5. To Exit\n");
		System.out.println("Enter your choice:");
        ch=in.nextInt();
        switch(ch)
        {
		    case 1:try{  
			            PreparedStatement ps=con.prepareStatement("insert into Student(Roll_No,Name)values(?,?)");
			            System.out.println("Enter the Roll No:");
                        r=in.nextInt();
                        System.out.println("Enter the Name:"); 
                        in.nextLine();
                        s=in.nextLine(); 

                        ps.setInt(1,r);
                        ps.setString(2,s); 
                        ps.executeUpdate(); 
            }
            catch(Exception er)
            {
                System.out.println("Issue in inserting!!");
            }  
            System.out.println();
            break; 
            
            case 2:
			System.out.println("Fetching the records:");  
            try{
            PreparedStatement ps2=con.prepareStatement("select * from Student");
			rs= ps2.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			}  
            }
            catch(Exception e)
            {
                System.out.println("Fetching Issues!!");
            }  
            System.out.println();
            break; 
            
            case 3:
			System.out.println("Modifying The records:"); 
            try{ 
            	in.nextLine();
                System.out.println("Enter the name to be modified:");
                
                String st=in.nextLine(); 
                
                System.out.println("Enter the roll No.:");
                int ro=in.nextInt(); 
                PreparedStatement ps3=con.prepareStatement("update Student set Name=? where Roll_No=?");
                ps3.setString(1,st);
                ps3.setInt(2, ro);  
                ps3.executeUpdate();
                
           
            PreparedStatement p2=con.prepareStatement("select * from Student");
			rs= p2.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			} 
			} 
            catch(Exception er)
            {
                System.out.println("Modifying Issue");
            } 
            System.out.println();
            break; 
            case 4:
			System.out.println("Enter the Roll no. to be deleted");
            r=in.nextInt(); 
            try{
            PreparedStatement ps4=con.prepareStatement("delete from Student where Roll_No=?");
            ps4.setInt(1, r);
            ps4.executeUpdate(); 
            
            PreparedStatement p3=con.prepareStatement("select * from Student");
			rs= p3.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2));
				System.out.println();
			} 
			} 
            catch(Exception e)
			{
			System.out.println("Deleting Issue!!!");
			} 
			System.out.println();
		
        break; 
        case 5:System.out.println("bye Bye!!!"); 
        		break;
        default:System.out.println("Invalid Choice!!!"); 
        }
    } while(ch!=5); 
		
	}
}
