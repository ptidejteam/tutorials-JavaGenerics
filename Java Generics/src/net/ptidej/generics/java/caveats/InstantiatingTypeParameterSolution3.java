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
package net.ptidej.generics.java.caveats;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

abstract class GenericClass<T> {
	public T getInstanceOfT() {
		final ParameterizedType pt =
			(ParameterizedType) this.getClass().getGenericSuperclass();
		final String parameterClassName =
			pt.getActualTypeArguments()[0].toString().split("\\s")[1];
		T parameter = null;
		try {
			parameter = (T) Class.forName(parameterClassName).newInstance();
		}
		catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return parameter;
	}
}
public class InstantiatingTypeParameterSolution3 extends GenericClass<String> {
	public static void main(final String[] args) {
		final InstantiatingTypeParameterSolution3 i =
			new InstantiatingTypeParameterSolution3();
		i.foo();
	}
	public void foo() {
		final Object s = this.getInstanceOfT();
		System.out.println(s.getClass());
	}
}
