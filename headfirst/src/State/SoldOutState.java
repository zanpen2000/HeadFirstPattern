package State;

public class SoldOutState implements IState {

	transient GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry, there is no gumball in this machine.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("turned your quarter.");
	}

	@Override
	public void turnCrank() {
		System.out.println("Sorry, there is no gumball in this machine.");
	}

	@Override
	public void dispense() {
		System.out.println("Sorry, there is no gumball in this machine.");
	}

}
