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
package net.ptidej.generics.java.animalfarm1;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Inspired from http://stackoverflow.com/questions/450807/java-generics-how-do-i-make-the-method-return-type-generic
 *
 */
public abstract class Animal {
	private final Map<String, Animal> friends = new HashMap<String, Animal>();

	// Require type casting:
	public final void addFriend1(final String name, final Animal animal) {
		this.friends.put(name, animal);
	}
	public final Animal callFriend1(final String name) {
		return this.friends.get(name);
	}

	// No need for type casting but for explicit type:
	public <T extends Animal> void addFriend2(
		final String name,
		final T animal,
		final Class<T> type) {

		this.friends.put(name, animal);
	}
	public <T extends Animal> T callFriend2(
		final String name,
		final Class<T> type) {

		return type.cast(this.friends.get(name));
	}

	// No need for type casting and explicit type:
	public <T extends Animal> void addFriend3(final String name, final T animal) {
		this.friends.put(name, animal);
	}
	public <T extends Animal> T callFriend3(final String name) {
		final T animal = (T) this.friends.get(name);
		return animal;
	}
}