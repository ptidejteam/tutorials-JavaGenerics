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

public class Caller {
	public static void main(final String[] args) {
		final Mouse jerry = new Mouse();

		jerry.addFriend1("Salt", new Dog());
		jerry.addFriend1("Huey", new Duck());
		((Dog) jerry.callFriend1("Salt")).bark();
		((Duck) jerry.callFriend1("Huey")).quack();

		jerry.addFriend2("Pepper", new Dog(), Dog.class);
		jerry.addFriend2("Dewey", new Duck(), Duck.class);
		jerry.callFriend2("Pepper", Dog.class).bark();
		jerry.callFriend2("Dewey", Duck.class).quack();

		jerry.addFriend3("Mustard", new Dog());
		jerry.addFriend3("Louie", new Duck());
		// Does not compile because compiler has no means to
		// know that method callFriend3 will return an instance
		// of Dog (first line) and Duck (second line). 
		//	 jerry.callFriend3("Mustard").bark();
		//	 jerry.callFriend3("Louie").quack();
		jerry.<Dog> callFriend3("Mustard").bark();
		jerry.<Duck> callFriend3("Louie").quack();
		final Dog dog = jerry.callFriend3("Mustard");
		dog.bark();
		// The compiler allows the following line because
		// the type in method callFriend3 is checked at
		// runtime: "(T) animal"
		//	final Dog dog2 = jerry.callFriend3("Louie");
		//	dog2.bark();
		final Duck duck = jerry.callFriend3("Louie");
		duck.quack();
	}
}
