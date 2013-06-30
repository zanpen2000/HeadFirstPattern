package Command;

public class CeilingFanMediumCommand extends CeilingFanFather {

	public CeilingFanMediumCommand(CeilingFan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		fan.medium();
	}
}
