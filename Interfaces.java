// Interfaces.java
// blueprint of a class that has static constants and abstract methods.
// All the methods are abstract by default.
// It is a mechanism to achieve abstraction and multiple inheritance.

// A class can extends another class.
// An interface can extend another interface.
// A class implements an intergface.

interface sample {
	void print(); // Should not have a body
}

class Interfaces implements sample {
	public void print() {
		System.out.println("Interface Example");
	}

	public static void main(String[] args) {
		Interfaces obj = new Interfaces();
		obj.print();
	}
}
