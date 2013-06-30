package Command;

public class CeilingFanHighCommand extends CeilingFanFather {

	public CeilingFanHighCommand(CeilingFan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		fan.high();
	}
}
