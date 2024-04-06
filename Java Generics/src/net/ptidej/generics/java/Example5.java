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

import java.io.FileNotFoundException;

interface Action<E extends Exception> {
	void run() throws E;
}
final class Executor {
	public static <E extends Exception> void execute(final Action<E> action)
			throws E {
		action.run();
	}
}
public final class Example5 {
	private static class FileAction implements Action<FileNotFoundException> {
		public void run() throws java.io.FileNotFoundException {
			throw new FileNotFoundException();
		}
	}
	public static void main(final String[] args) {
		try {
			Executor.execute(new FileAction());
		}
		catch (final FileNotFoundException f) {
			// Do something}
		}
	}
}