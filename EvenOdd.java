package productproject;

public class EvenOdd {

	public static void main(String[] args) {
		int r;
		int num = 9;
		r=num%2;
		switch(r)
		{
		case 0:System.out.println("The given Num "+num+ "is even num");
		break;
		case 1:System.out.println("The given Num "+num+ "is odd num");
		break;
		}

	}

}
