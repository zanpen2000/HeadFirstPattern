package State;

import java.io.Serializable;

public interface IState extends Serializable {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
