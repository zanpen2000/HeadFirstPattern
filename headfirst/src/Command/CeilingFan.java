package Command;

public class CeilingFan {

	String desc;

	public CeilingFan(String desc) {
		this.desc = desc;
	}

	public void on() {
		System.out.println("Ceiling Fan is ON!");
	}

	public void off() {
		System.out.println("Ceiling Fan is OFF!");
	}

}
