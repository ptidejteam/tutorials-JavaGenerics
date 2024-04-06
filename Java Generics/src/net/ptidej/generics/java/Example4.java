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

public final class Example4 {
	public static void main(final String[] args) {
		System.out.println(Util4.<String> compare("a", "b"));
		//	System.out.println(Util.<String> compare(new String(""), new Long(1)));
		System.out.println(Util4.compare(new String(""), new Long(1)));
	}
}

final class Util4 {
	public static <T> boolean compare(final T t1, final T t2) {
		return t1.equals(t2);
	}
}
