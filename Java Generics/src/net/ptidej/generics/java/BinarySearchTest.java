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

import junit.framework.Assert;
import junit.framework.TestCase;

public class BinarySearchTest extends TestCase {
	public void testStrings() {
		final String[] values =
			{ "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf",
					"Hotel", "India", "Juliet", "Kilo", "Lima", "Mike",
					"November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra",
					"Tango", "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee",
					"Zulu" };

		final BinarySearch<String> searcher = new BinarySearch<String>(values);
		Assert.assertEquals(13, searcher.search("November"));
		Assert.assertEquals(-1, searcher.search("December"));
	}

	public void testIntegers() {
		final Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		final BinarySearch<Integer> searcher =
			new BinarySearch<Integer>(values);
		Assert.assertEquals(2, searcher.search(new Integer(3)));
		Assert.assertEquals(-1, searcher.search(new Integer(11)));
	}
}
