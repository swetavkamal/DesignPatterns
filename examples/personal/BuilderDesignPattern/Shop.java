package examples.personal.BuilderDesignPattern;

public class Shop {
	
	
	public static void main(String args[])
	{
		Phone p = new PhoneBuilder().setRam(2).getPhone();
		System.out.println(p);
	}

}
