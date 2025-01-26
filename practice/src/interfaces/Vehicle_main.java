package interfaces;

public class Vehicle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle vr = new Car("fiber", "Diesel", 5);
        vr.start();
        Vehicle vr1= new Car("Steel", "Ev", 4);
        vr1.start();
        vr1.stop();
        
		
	}

}
