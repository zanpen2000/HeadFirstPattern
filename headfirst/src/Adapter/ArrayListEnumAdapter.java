package Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListEnumAdapter<E> implements Enumeration<E> {

	Iterator<E> iter;

	public ArrayListEnumAdapter(Iterator<E> iter) {
		super();
		this.iter = iter;
	}

	@Override
	public boolean hasMoreElements() {
		return iter.hasNext();
	}

	@Override
	public E nextElement() {
		return iter.next();
	}

}
