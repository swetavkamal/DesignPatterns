package examples.personal.BuilderDesignPattern;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double ScreenSize;
	private int battery;
	
	
	//Creating the constructor for all the variables...
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		ScreenSize = screenSize;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", ScreenSize=" + ScreenSize
				+ ", battery=" + battery + "]";
	}
	

}
