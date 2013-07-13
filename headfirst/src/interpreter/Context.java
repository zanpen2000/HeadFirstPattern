package interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

	public void assign(Variable var, Boolean value) {
		map.put(var, value);
	}

	public boolean lookup(Variable var) {
		Boolean value = map.get(var);
		if (value == null) {
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
	
	
}
