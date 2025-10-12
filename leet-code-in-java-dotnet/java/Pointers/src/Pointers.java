
public class Pointers {

	public static void printAddress(String s, int n) {
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(n));
	}

	public static void main(String[] args) {

		String s = new String("This is my string");
		String anotherString = s;
		String someOtherString = "This is my another string";

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(anotherString));
		System.out.println(System.identityHashCode(someOtherString));

		// Now point the another string to some other string
		anotherString = someOtherString;

		System.out.println(System.identityHashCode(anotherString));
		System.out.println(System.identityHashCode(someOtherString));

		int n1 = 10;
		int n2 = 11;

		// Print the hash of n1
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));

		n2 = n1;
		// Print the hash of n1
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));

		System.out.println("Value of n1: " + n1 + " and the value of n2: " + n2);

		int n11 = 10;
		String ss = "To be passed";

		// Print the hash of n1
		System.out.println(System.identityHashCode(n11));
		System.out.println(System.identityHashCode(ss));

		printAddress(ss, n11);

	}

}
