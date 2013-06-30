package Command;

public class CeilingFanOffCommand extends CeilingFanFather {

	public CeilingFanOffCommand(CeilingFan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		fan.off();
	}

}
