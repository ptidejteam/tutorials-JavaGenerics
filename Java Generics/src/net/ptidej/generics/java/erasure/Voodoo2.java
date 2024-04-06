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
package net.ptidej.generics.java.erasure;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 * Local classes
 * See http://stackoverflow.com/questions/1901164/get-type-of-a-generic-parameter-in-java-with-reflection
 */
public final class Voodoo2 extends TestCase {
	public static void chill(final List<?> aListWithSomeType) {
		// Here I'd like to get the Class-Object 'SpiderMan'
		CommonTest.assertEqualAsExpected(
			aListWithSomeType,
			SpiderManVoodoo2.class);
	}
	public static void main(final String... args) {
		class LocalArrayList extends ArrayList<SpiderManVoodoo2> {
			private static final long serialVersionUID = 7230565594529850788L;
		}
		Voodoo2.chill(new LocalArrayList());
	}
	public void test() {
		Voodoo2.main(new String[0]);
	}
}
class SpiderManVoodoo2 {
}