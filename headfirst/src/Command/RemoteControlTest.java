package Command;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		//开灯
		Light light = new Light("");
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		//开门
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();

	}

}
