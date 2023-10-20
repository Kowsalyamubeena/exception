package exception;

public class ArrayIdxOBdEx10 {
	public static void main(String[] args) {
		int[] a= {10,2,4};
		try {
		System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println("cleared exp");
		}
		finally
		{
			System.out.println("array Index notfound");
		}
		System.out.println("bye");

	}

}
