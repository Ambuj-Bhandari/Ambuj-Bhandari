import java.io.*;
class fivow
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		System.out.println("The Vowels are: ");
		while((i=bis.read())!=-1)
		{ 
			char ch=(char)i;
			if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				System.out.print(ch+" ");  
		} 
		System.out.println();
		bis.close();
		fis.close();

		
	}
}
