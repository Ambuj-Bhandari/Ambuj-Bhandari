import java.io.*;
class BRead2
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);  
		} 
		System.out.println();
		bis.close();
		fis.close();

		
	}
}
