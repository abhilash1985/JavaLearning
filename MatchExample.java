// MatchExample.java

class MatchExample {
	public static void main(String[] args) {
		String str = new String("Java String Methods");

        System.out.println("Original String: " + str);

		System.out.println("Regex: (.*)String(.*) matches String? ");
		System.out.println(str.matches("(.*)String(.*)"));

		System.out.println("Regex: (.*)Stringa(.*) matches String? ");
		System.out.println(str.matches("(.*)Stringa(.*)"));

		System.out.println("Regex: (.*)Methods matches String? ");
		System.out.println(str.matches("(.*)Methods"));
	}
}
