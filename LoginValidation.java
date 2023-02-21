package arr;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		String uname,upass;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter name and password");
		uname=sc.next();
		upass=sc.next();
		
		if(uname.equals("neha") && upass.equals("neha123"))
		{
			System.out.println("valid user");
		}
		else
		{
			System.out.println("not valid");
		}

	}

}
