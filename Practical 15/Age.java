import java.util.*;
class AgeException extends RuntimeException
{
	AgeException(String s)
	{
		super(s);	
	}
}
class Age
{
	final int a=18;
	void check(int ag)
	{
		if(ag<a)
			throw new AgeException("Inelligible to vote.....Age is less than 18\n"); 
		else
			System.out.println("Citizen is elligible to vote");
	}
	public static void main(String args[])
	{
		Age d=new Age();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the age of citizen: ");
		int ag=in.nextInt();
		d.check(ag);
		 
		
	}
}
