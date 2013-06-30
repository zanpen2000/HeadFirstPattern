package Command;

public class CeilingFanFather implements Command {

	int prevSpeed;
	
	CeilingFan fan;
	
	public CeilingFanFather(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
	}

	@Override
	public void undo() {
		
		if (prevSpeed == CeilingFan.HIGH)
			fan.high();
		else if (prevSpeed == CeilingFan.MEDIUM)
			fan.medium();
		else if (prevSpeed == CeilingFan.LOW)
			fan.low();
		else if (prevSpeed == CeilingFan.OFF)
			fan.off();
	}

	
	

}
