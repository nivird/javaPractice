package learn23;

public class ExcepCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case excpetion at statement2, @s2
		int arr[]= {2,4,6,8,10};
try
{
	System.out.println("The index value of arr[0]: "+arr[0]);
	System.out.println("the second index value: "+arr[11]);
	System.out.println("the third index value: "+arr[2]);
}
catch(ArithmeticException e)
{
	System.out.println("throws exception"+e);
}
finally
{
	System.out.println("there is exception");
}
System.out.println("Example for exception case 2");
	}

}
