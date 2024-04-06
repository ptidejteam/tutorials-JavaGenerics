package net.ptidej.generics.java;

import java.util.List;

public interface ISort2 {
	public <E extends Comparable<E>> List<E> sort(final List<E> aList);
}
