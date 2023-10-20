package exception;

public class HandleStringIdobEx9 {

	public static void HandleStringIdobEx9main(String[] args) {
		String a="num";
		try {
		String b=a.substring(3,6);
		System.out.println(b);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("clear");
		}
		finally
		{
			System.out.println("Finally= not found");
		}
		System.out.println("bye");
	}

}
