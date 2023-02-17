package largestnumber;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		char Grade;
		//System.out.println("Available Grades: \t A \t B \t C \tF");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grade betwwen O A B C D E F :");
		Grade=sc.next().charAt(0);
		System.out.println("Grade: "+Grade);
		
		if(Grade=='O') {
			System.out.println("Student has scored between 90 to 100");
		}
		else if(Grade=='A') {
			System.out.println("Student has scored between 80 to 89");
		}
		else if(Grade=='B') {
			System.out.println("Student has scored between 70 to 79");
		}
		else if(Grade=='C') {
			System.out.println("Student has scored between 60 to 69");
		}
		else if(Grade=='D') {
			System.out.println("Student has scored between 50 to 59");
		}
		
		else if(Grade=='E') {
			System.out.println("Student has scored between 40 to 49");
		}
		else if(Grade=='F') {
			System.out.println("Fail and Student has scored betweens 0 to 39");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
