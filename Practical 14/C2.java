package p2;
import p1.*;
import java.util.*;
public class C2 implements I1 
{  
	public int mul(int a,int b)
	{
		return(a*b); 
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		C1 d=new C1(); 
		C2 f=new C2();
		System.out.println("Enter 2 numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		
		System.out.println("Sum of a and b:"+d.sum(a,b));
		System.out.println("Division of a and b:"+d.div(a,b));
		System.out.println("Product of a and b:"+f.mul(a,b)); 
	}
}
	
