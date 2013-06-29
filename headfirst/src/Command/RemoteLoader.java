package Command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand fanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand doorUpCommand = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand doorDownCommand = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0,livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, fanOnCommand, fanOffCommand);
		remoteControl.setCommand(3, doorUpCommand, doorDownCommand);
		remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);
		
		System.out.println(remoteControl);
		
		for (int i = 0; i < 4; i++) {
			remoteControl.onButtonWasPushed(i);
			remoteControl.offButtonWasPushed(i);
		}
	}
	
}
