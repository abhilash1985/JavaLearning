// CharSequenceInterfaceExample.java

// compare(), concat(), equals(), length(), replace(), compareTo(), intern(),
// substring(), split()

class CharSequenceInterfaceExample {
	public static void main(String[] args) {
		String p = "Test";
		System.out.println("String p = " + p);

		String p2 = "New Test";
		System.out.println("String p2 = " + p2);

       // Concat
		p = p.concat(p2);
		System.out.println("Concatinated string p = " + p);

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Meklo";
		String s4 = "Hemlo";
		String s5 = "Flag";
		String s6 = "HELLO";

        // CompareTo
		System.out.println(s1.compareTo(s2)); //0 both are equal
		System.out.println(s1.compareTo(s3)); //-5 h is 5 times lower than m
		System.out.println(s1.compareTo(s4)); //-1 l is 1 time lower than m
		System.out.println(s1.compareTo(s5)); //2 h is 2 times greater than f

        // Equals
		System.out.println(s1.equals(s2)); //true both are equal
		System.out.println(s1.equals(s3)); //false content is not same
		System.out.println(s1.equals(s6)); //false case is not similar

		// Split
		String s7 = "java string split method sample";
		String[] words = s7.split("\\s"); // splits based on whitespace

		// Loop
		for(String w:words) {
			System.out.println("Splitted word = " + w);
		}

		// Substring
		System.out.println(s7.substring(2, 4)); // returns va
		System.out.println(s7.substring(2)); // returns va string split method sample

		// Format
		String name = "James";
		String sf1 = String.format("name is %s", name);
		String sf2 = String.format("value is %f", 32.32432);
		String sf3 = String.format("value is %32.12f", 32.32432); // returns 12 char fractional part fills with 0

		System.out.println(sf1); // returns name is James
		System.out.println(sf2); // returns value is 32.324320
		System.out.println(sf3); // returns value is                  32.324320000000

	}
}
