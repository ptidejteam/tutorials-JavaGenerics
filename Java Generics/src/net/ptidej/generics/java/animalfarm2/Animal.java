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
package net.ptidej.generics.java.animalfarm2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Inspired from http://stackoverflow.com/questions/450807/java-generics-how-do-i-make-the-method-return-type-generic
 *
 */
public abstract class Animal {
	private final Map<TypedID<?>, Animal> friends =
		new HashMap<TypedID<?>, Animal>();

	public final <T extends Animal> void addFriend(
		final TypedID<T> name,
		final T animal) {

		this.friends.put(name, animal);
	}
	public final <T extends Animal> T callFriend(final TypedID<T> name) {
		final Type type = name.getType();
		final Class<T> clazz = 
			(type instanceof Class<?>) ? (Class<T>) type
					: (Class<T>) ((ParameterizedType) type).getRawType();

		return (T)this.friends.get(name);
	}
}