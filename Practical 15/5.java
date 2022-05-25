import java.io.*;
class FIS3
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt"); 
		FileOutputStream fos=new FileOutputStream("file2.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			fos.write(i);  
		} 
		System.out.println();
		fis.close(); 
		fos.close();

		
	}
}
