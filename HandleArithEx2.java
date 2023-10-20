package exception;

public class HandleArithEx2 {
	public static void main(String[] args) {
		System.out.println("hi");
		int a=10;
		int b=0;
		try
		{
		System.out.println(a/b);
		}
//		finally
//		{
//			System.out.println("hibye");
//		}
		catch(Exception e)
		{
			System.out.println("Don't divide number by 0");
			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("bye");
	}

}
