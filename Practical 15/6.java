import java.io.*;
class RW
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr); 

		String i; 
		try{
			while((i=br.readLine())!=null)
			{
				System.out.print(i);  
			} 
			System.out.println();
		} 
		finally
		{
			br.close();
			fr.close();
		}

		
	}
}
