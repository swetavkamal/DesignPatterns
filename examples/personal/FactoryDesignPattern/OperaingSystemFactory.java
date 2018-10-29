package examples.personal.FactoryDesignPattern;

public class OperaingSystemFactory {

	
	public OS getInstance(String str)
	{
		if(str.equals("OpenSource"))
			return new AndriodOS();
		if(str.equals("ClosedOS"))
			return new IOS();
		else
			return new WindowsOS();
		
	}
	
}
