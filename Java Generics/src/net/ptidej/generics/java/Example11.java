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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

class Example11A {
}
class MyList extends ArrayList<Integer> {
	private static final long serialVersionUID = 9048553787778482292L;
}
public class Example11 {
	public static void main(final String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException {

		final Example11A anA1 = new Example11A();
		final Class<Example11A> anA1Class = (Class<Example11A>) anA1.getClass();
		System.out.println(anA1Class);

		final Example11A anA2 = new Example11A();
		final Class<? extends Example11A> anA2Class = anA2.getClass();
		System.out.println(anA2Class);

		final List<Integer> list1 = new ArrayList<Integer>();
		final Class<List<Integer>> list1Class =
			(Class<List<Integer>>) list1.getClass();
		System.out.println(list1Class);

		final MyList list2 = new MyList();
		Class<? extends List<? extends Integer>> list2Class = list2.getClass();
		System.out.println(list2Class);
	}
}
