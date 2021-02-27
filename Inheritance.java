// Inheritance.java

class Inheritance extends FirstClass {
	public static void main(String[] args) {
		Inheritance f1 = new Inheritance();

		System.out.println(f1.getWeight()); // returns 0

		f1.setWeight(100);

		System.out.println(f1.getWeight()); // returns 100
	}
}
