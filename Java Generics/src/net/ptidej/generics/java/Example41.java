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

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class Example41 {
	public static void main(final String[] args) {
		System.out.println(Util41.compare(
			new TypeReference41<ACommonClass41Subclass1>(),
			new TypeReference41<ACommonClass41Subclass2>() {}));
	}
}

final class Util41 {
	public static <T> boolean compare(final T t1, final T t2) {
		System.out.println(((TypeReference41<T>) t1).getType());
		System.out.println(((TypeReference41<T>) t2).getType());
		return t1.equals(t2);
	}
}

class ACommonClass41 {
	final void foo() {
	}
}
class ACommonClass41Subclass1 extends ACommonClass41 {
}
class ACommonClass41Subclass2 extends ACommonClass41 {
}
class TypeReference41<T> {
	public static Class<?> getClass(final Type type) {
		if (type instanceof Class) {
			return (Class) type;
		}
		else if (type instanceof ParameterizedType) {
			return TypeReference41.getClass(((ParameterizedType) type)
				.getActualTypeArguments()[0]);
		}
		else if (type instanceof GenericArrayType) {
			final Type componentType =
				((GenericArrayType) type).getGenericComponentType();
			final Class<?> componentClass =
				TypeReference41.getClass(componentType);
			if (componentClass != null) {
				return Array.newInstance(componentClass, 0).getClass();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	private final Type type;

	protected TypeReference41() {
		final Type superClass = getClass().getGenericSuperclass();
		this.type = TypeReference41.getClass(superClass);
	}

	public Type getType() {
		return this.type;
	}
}
