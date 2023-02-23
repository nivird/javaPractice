package learn23;

public class ExcepAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//case 1: No Exception
		int arr[]= {5,10,15,20};
		
		try
		{
			System.out.println("The index value of arr: "+arr[0]);
			System.out.println("The index value of arr: "+arr[1]);
			System.out.println("The index value of arr: "+arr[2]);
		}
		catch(Exception e)
		{
			System.out.println("there is some err");
			
		}
		finally
		{
			System.out.println("No exception");
		}
		System.out.println("Examle for no Exception case1");
	}

}
