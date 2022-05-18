import java.io.*;
class ReadB
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		
		System.out.println("The first byte After reading from file1.txt is: "+(char)(bis.read())); 
		bis.close();
		fis.close();

		
	}
}
