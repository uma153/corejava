package arr;

import java.util.Scanner;

  class Stu
{
	int sid;
	String sname;
	float sfees;
	
	 void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		sname=sc.nextLine();
		System.out.println("Enter the id");
		sid=sc.nextInt();
		System.out.println("Enter the fees");
		sfees=sc.nextFloat();
	}
	 
	 void display()
	{
		System.out.println("name"+sname);
		System.out.println("id"+sid);
		System.out.println("fees"+sfees);

	}
}

	public class Student {
	public static void main(String[] args) 
		
	{
		Stu s1=new Stu();
		Stu s2=new Stu();
		Stu s3=new Stu();
		Stu s4=new Stu();
		Stu s5=new Stu();  
		
		s1.inputdata();
		s2.inputdata();
		s3.inputdata();
		s4.inputdata();
		s5.inputdata();
		
		System.out.println("All Student details ");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}

		
	}

		
	
	
	
	
	


