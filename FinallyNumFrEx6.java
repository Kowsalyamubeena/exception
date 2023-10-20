package exception;

public class FinallyNumFrEx6 {
	public static void main(String[] args) {
		String num="TN63";
		try {
		int n1=Integer.parseInt(num);
		System.out.println(n1);
		}
		finally
		{
			System.out.println("this is instant no correct");
		}
		System.out.println("bye");
	}


}
