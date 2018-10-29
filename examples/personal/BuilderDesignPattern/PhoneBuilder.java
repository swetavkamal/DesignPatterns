package examples.personal.BuilderDesignPattern;

public class PhoneBuilder {
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	public void setOs(String os) {
		this.os = os;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	
	
	//This will return the phone object...
	public Phone getPhone()
	{
		return new Phone(os, ram, processor, screenSize, battery);
		
	}
	
	
	

}
