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

interface Factory<T> {
	T getInstance();
}

class Something {
	public static class FactoryOfSomething implements Factory<Something> {
		public Something getInstance() {
			return new Something();
		}
	}
}
public class InstantiatingTypeParameterSolution2<T> {
	public static void main(final String[] args) {
		final InstantiatingTypeParameterSolution2<Something> i =
			new InstantiatingTypeParameterSolution2<Something>();
		i.foo(new Something.FactoryOfSomething());
	}
	public void foo(final Factory<T> factory) {
		final T t = this.getInstanceOfT(factory);
		System.out.println(t.getClass());
	}
	public T getInstanceOfT(final Factory<T> factory) {
		return factory.getInstance();
	}
}
