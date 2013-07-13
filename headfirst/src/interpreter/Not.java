package interpreter;


public class Not extends Expression {
	
	private Expression exp;

	public Not(Expression exp) {
		this.exp = exp;
	}

	@Override
	public boolean interpret(Context cxt) {
		return !exp.interpret(cxt);
	}

	@Override
	public boolean equals(Object obj) {
		if (exp != null && obj instanceof Not){
			return exp.equals(((Not)obj).exp);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not " + exp.toString() + ")";
	}

}
