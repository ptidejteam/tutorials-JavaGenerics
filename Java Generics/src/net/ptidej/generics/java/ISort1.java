package net.ptidej.generics.java;

import java.util.List;

public interface ISort1<E extends Comparable<E>> {
	public List<E> sort(final List<E> aList);
}
