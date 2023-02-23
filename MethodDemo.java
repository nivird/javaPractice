package learn23;

public class MethodDemo {

	
/*static void status()
{
	System.out.println("hello world");
}*/
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add()
	{
		int a=5,b=10;
		return a+b;
	}
	static int sub()
	{
		int a=20,b=25;
		return a-b;
	}
	static int product()
	{
		int a=20,b=40;
		return a*b;
	}
	static int product(int a,int b)
	{
		return a*b;
	}
	static int divide()
	{
		int a=100,b=50;
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//status();
		System.out.println("sum of two numbers: "+add());
		System.out.println("sum of two no.s with parameters and method overloading: "+add(5,5));
		System.out.println("difference between two numbers: "+sub());
		System.out.println("product of two numbers: "+product());
		System.out.println("product method with parameters: "+product(5,5));
		System.out.println("Divisio of two numbers: "+divide());
		
		
	}

}
