package accessModifier1;

import accessModifier.protected_Example;

public class protectedClassMain {

	public static void main(String[] args) {
		protected_Example obj = new protected_Example();
		obj.hello();
		// obj.add(2, 3);

	}

}

/*
 * o/p Exception in thread "main" java.lang.Error: Unresolved compilation
 * problem: The method add(int, int) from the type protected_Example is not
 * visible
 * 
 * at accessModifier1.protectedClassMain.main(protectedClassMain.java:10)
 */