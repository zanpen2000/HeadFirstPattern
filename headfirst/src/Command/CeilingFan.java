package Command;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high(){
		speed = HIGH;
		System.out.println("Ceiling Fan is high!");
	}
	
	public void medium(){
		speed = MEDIUM;
		System.out.println("Ceiling Fan is medium!");
	}
	
	public void low(){
		speed = LOW;
		System.out.println("Ceiling Fan is low!");
	}
	
	public void off()
	{
		speed = OFF;
		System.out.println("Ceiling Fan is off!");
	}
	
	public int getSpeed(){
		return speed;
	}
	
//	public void on() {
//		System.out.println("Ceiling Fan is ON!");
//	}
//
//	public void off() {
//		System.out.println("Ceiling Fan is OFF!");
//	}
	
	

}
