package arr;

public class Copy {

	public static void main(String[] args) {
		int a[] = {2,4,6,8,0};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Elements in a :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		}
				
		System.out.println("Elements in b copied from a :");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i] + " ");
		}

	}

}
