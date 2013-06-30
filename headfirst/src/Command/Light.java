package Command;

public class Light {

	String desc;
	
	public Light(String desc) {
		this.desc = desc;
	}

	public void on() {
		System.out.println("Light is On!");
	}

	public void off() {
		System.out.println("Light is Off!");

	}

	@Override
	public String toString() {
		
		return this.desc;
		
	}
	
	

}
