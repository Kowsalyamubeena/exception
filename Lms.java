package exception1customExCreate;

public class Lms {
	public static void main(String[] args)throws NoWarrantyException {
		Ac a=new Ac("sam","sam13",20000,0);
		Ac a1=new Ac("pan","pan22",40000,10);
		Ac a2=new Ac("onida","Od19",18000,-1);
		Ac[] ab= {a,a1,a2};
		for(int i=0;i<ab.length;i++)
		{
			try
		{
			if(ab[i].getNoOfMonthsWarranty()<=0)
			{
				throw new NoWarrantyException("NoWarrantyException ");
				}
		
			else
			{
				System.out.println(ab[i].getNoOfMonthsWarranty()+" Correct Number Of warranty");
			}
		}
		
		catch(NoWarrantyException e)
		{
			System.out.println(e+"give correct warrantry months");
		}
		}
	}
}
class NoWarrantyException extends Exception
{
	public NoWarrantyException(String s)
	{
		super(s);
	}
}
class Ac
{
	String model;
	String brand;
	int price;
	int noOfMonthsWarranty;
	public Ac(String model, String brand, int price, int noOfMonthsWarranty) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfMonthsWarranty() {
		return noOfMonthsWarranty;
	}
	public void setNoOfMonthsWarranty(int noOfMonthsWarranty) {
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}
	@Override
	public String toString() {
		return "Ac [model=" + model + ", brand=" + brand + ", price=" + price + ", noOfMonthsWarranty="
				+ noOfMonthsWarranty + "]";
	}
	
}
