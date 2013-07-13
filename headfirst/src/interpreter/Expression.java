package interpreter;

public abstract class Expression {

	public abstract boolean interpret(Context cxt);
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();
	
	public abstract String toString();
}
