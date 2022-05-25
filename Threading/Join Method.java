class Ab implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print("From A: "+i+" ");
		}
	}
}
class Bc implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("From B: "+i);
		} 
		
	}
}
class XYZ
{
	public static void main(String args[])
	{
		Ab c=new Ab();
		Bc b=new Bc();
		Thread t1= new Thread(c); 
		Thread t2= new Thread(b);
		t1.start();
		t2.start();
		try
		{
		t1.join();
		t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
