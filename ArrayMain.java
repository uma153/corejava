package arr;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args)
	{
	     int sum = 0;
	     float avg;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arrray Element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        //this is for to find a sum of given array.
		for(int i=0;i<a.length;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println("sum of all array elements "+sum);
        
        //avarage
        avg=(float)sum/a.length;
        System.out.println("Averae of all array elements "+avg);
        
        }
}


