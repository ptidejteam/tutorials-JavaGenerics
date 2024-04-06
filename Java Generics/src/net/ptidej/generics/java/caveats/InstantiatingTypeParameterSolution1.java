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

public class InstantiatingTypeParameterSolution1<T> {
	public static void main(final String[] args) throws InstantiationException,
			IllegalAccessException {
		final InstantiatingTypeParameterSolution1<String> i =
			new InstantiatingTypeParameterSolution1<String>();
		i.foo(String.class);
	}
	public void foo(final Class<T> classOfT) throws InstantiationException,
			IllegalAccessException {
		final T t = this.getInstanceOfT(classOfT);
		System.out.println(t.getClass());
	}
	public T getInstanceOfT(final Class<T> classOfT)
			throws InstantiationException, IllegalAccessException {

		return classOfT.newInstance();
	}
}
