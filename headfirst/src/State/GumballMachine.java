package State;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

	String location;
	IState soldOutState;

	public IState getSoldOutState() {
		return this.soldOutState;
	}

	public void setSoldOutState(IState soldOutState) {
		this.soldOutState = soldOutState;
	}

	IState noQuarterState;

	public IState getNoQuarterState() {
		return this.noQuarterState;
	}

	public void setNoQuarterState(IState noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	IState hasQuarterState;

	public IState getHasQuarterState() {
		return this.hasQuarterState;
	}

	public void setHasQuarterState(IState hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	IState soldState;

	public IState getSoldState() {
		return this.soldState;
	}

	public void setSoldState(IState soldState) {
		this.soldState = soldState;
	}
	
	IState winnerState;

	public IState getWinnerState() { 
		return winnerState;
	}

	public void setWinnerState(IState winnerState) {
		this.winnerState = winnerState;
	}

	public String getLocation()
	{
		return location;
	}
	
	IState state = soldOutState;
	int count = 0;

	public GumballMachine(String location,int numberGumballs) throws RemoteException {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this); 
		soldState = new SoldState(this);
		this.count = numberGumballs;
		this.location = location;
		if (numberGumballs > 0)
			state = noQuarterState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(IState state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0)
			count = count - 1;
	}

	public int getCount() {
		return count;
	}

	public IState getState() {
		return state;
	}
}
