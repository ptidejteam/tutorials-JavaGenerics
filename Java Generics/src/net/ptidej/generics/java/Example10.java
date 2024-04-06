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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Example10A {
}
public class Example10 {
	public static void main(final String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException {

		final Class<Example10A> clazz1 = Example10A.class;
		final Example10A anA1 = clazz1.newInstance();
		System.out.println(anA1);

		final Class<?> clazz2 =
			Class.forName("ca.polymtl.ptidej.generics.java.Example9A");
		final Example10A anA2 = (Example10A) clazz2.newInstance();
		System.out.println(anA2);

		final Class clazz3 =
			Class.forName("ca.polymtl.ptidej.generics.java.Example9A");
		final Example10A anA3 = (Example10A) clazz3.newInstance();
		System.out.println(anA3);

		final Constructor<?> c = clazz2.getConstructor(new Class[0]);
		final Example10A anA4 = (Example10A) c.newInstance(new Object[0]);
		System.out.println(anA4);
	}
}