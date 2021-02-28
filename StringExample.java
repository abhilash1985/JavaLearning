// StringExample.java

class StringExample {
	public static void main(String[] args) {
		String s = "Test";
		System.out.println("String s = " + s);
		s.concat("New");
		System.out.println("String s = " + s);

		String a = s.concat("New");
		System.out.println("String a = " + a);
	}
}
