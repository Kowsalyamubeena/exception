package exception1customExCreate;

public class ExpCreate1 {
	public static void main(String[] args) throws AgeException
	{
		String name="kows";
		int age=17;
		if(age>=18)
		{
			System.out.println("welcome"+name);
		}
		else
		{
//			System.out.println("welcome");
			throw new AgeException(name+" not valid id");
		}
	 System.out.println("male");
	}

}
class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
	
}

	
