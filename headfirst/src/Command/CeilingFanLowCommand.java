package Command;

public class CeilingFanLowCommand extends CeilingFanFather {

	public CeilingFanLowCommand(CeilingFan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		fan.low();
	}
}
