package Command;

public class GarageDoorUpCommand implements Command {

	@Override
	public void undo() {
		garageDoor.down();
	}

	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();

	}

}
