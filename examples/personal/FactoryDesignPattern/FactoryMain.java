package examples.personal.FactoryDesignPattern;

public class FactoryMain {

	public static void main(String args[])
	{
		OperaingSystemFactory osf= new OperaingSystemFactory();
		OS obj= osf.getInstance("ClosedOS");
		obj.spec();
		
	}
	
}
