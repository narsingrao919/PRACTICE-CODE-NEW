package interfaces;

public class Car implements Vehicle {
	String body;
	String enginetype;
	int seatingcapacity;
	
	public Car(String body,String enginetype,int seatingcapacity) {
		this.body=body;
		this.enginetype=enginetype;
		this.seatingcapacity=seatingcapacity;
	}
	
	public void start() {
		System.out.println("starting the car:"
	          +" "+body+" "+" "+enginetype+" "+" "+seatingcapacity);
	}
	public void stop() {
		System.out.println("Engine is stoping:");
	}
}
