package exception;

public class HandleNumFrEx7 {
	public static void main(String[] args) {
		String num="TN63";
		try {
		int n1=Integer.parseInt(num);
		System.out.println(n1);
		}
		catch(Exception e)
		{
			System.out.println("null");
		}
		finally
		{
			System.out.println("this is instant no correct");
		}
		
		System.out.println("bye");
	}

}
