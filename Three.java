package largestnumber;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First num :");
		n1=sc.nextInt();
		System.out.println("Enter The Second num :");
		n2=sc.nextInt();
		System.out.println("Enter The Third num :");
		n3=sc.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("The greatest of Three Num is : " +n1);
		}
		if(n2>n1 && n2>n3)
		{
			System.out.println("The greatest of Three Num is : " +n2);
		}
		if(n3>n2 && n3>n2)
		{
			System.out.println("The greatest of Three Num is : " +n3);
		}

	}

}
