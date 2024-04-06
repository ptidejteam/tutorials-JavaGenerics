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

public class BinarySearch<T extends Comparable<T>> {
	private final T[] values;

	public BinarySearch(final T[] someValues) {
		this.values = someValues;
	}

	public int search(final Comparable<T> aValueToSearch) {
		int low = 0;
		int high = this.values.length - 1;

		while (low <= high) {
			final int mid = (low + high) / 2;
			final T midVal = this.values[mid];

			final int result = aValueToSearch.compareTo(midVal);
			if (result < 0) {
				high = mid - 1;
			}
			else if (result > 0) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}

		return -1;
	}
}