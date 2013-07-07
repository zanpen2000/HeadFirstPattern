package State;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
	public static void main(String[] args) {

		int count = 0;

		if (args.length < 2) {
			System.out.println("Gumball Machine <name> <inventory>");
			System.exit(1);
		}

		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = null;
		try {
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		monitor.report();
	}
}
