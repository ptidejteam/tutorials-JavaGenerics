/* (c) Copyright 2001 and following years, Yann-Gaël Guéhéneuc
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package net.ptidej.generics.java;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
	public static void main(final String[] args) {
		final Sort7<Comparable> sort = new Sort7<Comparable>();
		final List<Comparable> listOfAs = new ArrayList<Comparable>();
		listOfAs.add(new I());
		sort.sort(listOfAs);
		System.out.println();
	}
}

class Sort7<E extends Comparable> {
	public List<E> sort(final List<E> aList) {
		final E e = aList.get(0);
		e.compareTo(new Object()); 
		// Impossible to reproduce C++ template example
		// http://stackoverflow.com/questions/6803100/achieving-bounded-genericity-in-c/6803124
		return null;
	}
}
final class I implements Comparable<I> {
	public int compareTo(final I anotherObject) {
		return 0;
	}
}
final class J implements Comparable {
	public int compareTo(final Object anotherObject) {
		return 0;
	}
}
final class K {
	public int compareTo(final Object anotherObject) {
		return 0;
	}
}