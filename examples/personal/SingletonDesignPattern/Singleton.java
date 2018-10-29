package examples.personal.SingletonDesignPattern;

public class Singleton {
	
	
	public static void main(String args[])
	{
		Abc obj1= Abc.getInstance();
		
		// we cannot create with new as constructor is private
		// Since get instance is static it can not change with new calls..
	}

}



class Abc
{
	static Abc obj = new Abc();
	private Abc()
	{
		
	}
	
	public static Abc getInstance()
	{
		return obj;
	}
}