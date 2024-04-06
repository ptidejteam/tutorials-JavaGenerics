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

public final class Example43 {
	public static void main(final String[] args) {
		System.out.println(Util43.<String> compare("a", "b"));
		System.out.println(Util43.compare(new String(""), new Long(1)));
	}
}

final class Util43 {
	public static <T> boolean compare(T t1, T t2) {
		// I was expecting that isAssignableFrom() would return 
		//	true
		//	false
		// for the first invocation because T is explicitly a String
		// and then
		//	false
		//	true
		// for the second invocation because the compiler infers
		// that T must be Object but isAssignableFrom() works
		// with the concrete types of the parameters, thus it for
		// both lines it return
		//	true
		//	false
		System.out.println(t1.getClass().isAssignableFrom(String.class));
		System.out.println(t2.getClass().isAssignableFrom(Object.class));
		return t1.equals(t2);
	}
}
