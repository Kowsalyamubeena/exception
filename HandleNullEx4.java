package exception;

public class HandleNullEx4 {
	public static void main(String[] args) {
		System.out.println("Hi");
		String name=null;
		try
		{
			System.out.println(name.toUpperCase());

		}
		catch(Exception e)
		{
			System.out.println("nul point");
			System.out.println(e);         
//			e.printStackTrace();
		}
		System.out.println("bye");
	}

}
