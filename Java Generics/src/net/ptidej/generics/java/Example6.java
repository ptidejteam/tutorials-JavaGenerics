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

public final class Example6 {
	public static void main(final String[] args) {
		final Sort6<A> sort = new Sort6<A>();
		final List<A> listOfAs = new ArrayList<A>();
		sort.sort(listOfAs);
		System.out.println();
	}
}

final class Sort6<E extends Comparable<E>> {
	public List<E> sort(final List<E> aList) {
		return null;
	}
}
final class A implements Comparable<A> {
	@Override
	public int compareTo(final A o) {
		return 0;
	}
}
final class B implements Comparable<B> {
	@Override
	public int compareTo(final B o) {
		return 0;
	}
}