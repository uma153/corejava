package productproject;

class ProductMain
{

		String pname;
		int pid;
		float pprice;
		
		public ProductMain()
		{
		pname="LED";
		pid=121314;
		pprice=75000.0f;
		System.out.println("Product Name = " +pname);
		System.out.println("Product Id = " +pid );
		System.out.println("Product Price = "+pprice);
		}
		
		void displayProductMain()
		{
			System.out.println("Display method");
		}
}
public class Product
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Product pobj=new Product();
	}
}

	

