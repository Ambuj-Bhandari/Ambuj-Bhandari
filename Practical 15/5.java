import java.io.*;
class RW
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis); 

		FileOutputStream fos=new FileOutputStream("file2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos); 
		int i=0;
		while((i=bis.read())!=-1)
		{
			bos.write(i);  
		} 
		bos.close();
		bis.close();
		fos.close();
		fis.close();

		
	}
}
