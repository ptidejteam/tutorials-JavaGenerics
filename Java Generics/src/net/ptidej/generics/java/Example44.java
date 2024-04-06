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

public final class Example44 {
	public static void main(final String[] args) {
		System.out.println(new Util44<String>().compare("a", "b"));
		System.out.println(new Util44().compare(new String(""), new Long(1)));
	}
}

final class Util44<T> {
	private T aT;
	public boolean compare(T t1, T t2) {
		System.out.println(this.aT);
		// I was expecting the second and third assignments to fail
		// with the first invocation because T is explicitly a String
		// and then to work with the second invocation because I use
		// a raw type and the compiler must infer a common type for T.
		// Actually, all these assignments succeed with both invocation. 
		this.aT = (T) new String("z");
		this.aT = (T) new Long(0);
		this.aT = (T) new Object();
		return t1.equals(t2);
	}
}
