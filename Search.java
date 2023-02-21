package arr;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int search_Element;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the serch_Element : ");
		search_Element=sc.nextInt();
		int pos=-1;
		for(int i=0;i<arr.length;i++)
		{
		if(search_Element==arr[i])
		  {
			pos=i;
			break;
		  }
		}
		if(pos>-1)
		{
			System.out.println("Search is Successful");
			System.out.println(search_Element + " Present at position" + (pos + 1));
		}
		else
		{
			System.out.println("Unsuccessful search");
			System.out.println(search_Element + " Not found in a given array");
		}
	}

}
