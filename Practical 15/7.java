import java.io.*;
class ISR
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		FileOutputStream fos=new FileOutputStream("file4.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos); 

		System.out.println("Enter a String:");
		String str=br.readLine(); 
		byte b[]=str.getBytes();
		
		bos.write(b);
		bos.close();
		fos.close();
		br.close();
		isr.close();
	}
}

  		
