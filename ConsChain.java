import java.util.*;
class Student
{
	String name,Branch,city,university;
	long id;
	Student(String a)
	{
		name=a;
	}
	Student(String a,String b)
	{
		this.(a);
		Branch=b;
	}
	Student(String a,String b,String c)
	{
		this.(a,b);
		city=c;
	}
	Student(String a,String b,String c,String d)
	{
		this.(a,b,c);
		university=d;
	}
	Student(String a,String b,String c,String d,long e)
	{
		this.(a,b,c,d);
		id=e;
	}
	void display()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Branch: "+Branch);
		System.out.println("UNIVERSITY: "+university);
		System.out.println("City: "+city);
	}
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Name of Student");
		String a= in.nextLine();

		System.out.println("Enter the ID of Student");
		long b=in.nextLong();

		System.out.println("Enter the Branch of Student");
		String c=in.nextLine();

		System.out.println("Enter the  City");
		String d=in.nextLine();

		System.out.println("Enter the University Name");
		String e=in.nextLine();

		Student s=new Student(a,c,d,e,b);
		s.display();
	}

}
