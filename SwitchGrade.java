package largestnumber;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grade betwwen O A B C D :");
		grade=sc.next().charAt(0);
		switch (grade)
		{
		case 'O':System.out.println("Student has scored between 90 to 100");
		break;
		case 'A':System.out.println("Student has scored between 80 to 89");
		break;
		case 'B':System.out.println("Student has scored between 70 to 79");
		break;
		case 'C':System.out.println("Student has scored between 70 to 79");
		break;
		case 'D':System.out.println("Student has scored between 50 to 59");
		break;
		default:System.out.println("Invalid input");
		}
	}

}
