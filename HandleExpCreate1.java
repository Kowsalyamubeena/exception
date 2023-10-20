package exception1customExCreate;

public class HandleExpCreate1 {
	public static void main(String[] args) throws Age1Exception
	{
		String name="kows";
		int age=18;
		if(age>=18)
		{
			System.out.println("welcome "+name);
		}
		else
		{
//			System.out.println("welcome");
			throw new Age1Exception(name+" not valid id");
		}
		try
		{
			String adno="abuc1523";
			int n=Integer.parseInt(adno);
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println("give aadhar number in proper datatype");
		}
	}

}
class Age1Exception extends Exception
{
	public Age1Exception(String msg)
	{
		super(msg);
	}
	
}
