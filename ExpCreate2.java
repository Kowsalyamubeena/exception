package exception1customExCreate;

public class ExpCreate2 {
	public static void main(String[] args) throws CardException
	{
		String name="kows";
		int num=60;
		if(num!=62)
		{
//			System.out.println("welcome");
			throw new CardException("not allowed");

		}
		else
		{
			System.out.println("welcome"+name);
		}
	 System.out.println("male");
	}



}

class CardException extends Exception
{
	public CardException(String msg)
	{
		super(msg);
	}
	
}
