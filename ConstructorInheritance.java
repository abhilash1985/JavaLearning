// ConstructorInheritance.java

class ConstructorInheritance extends Constructor {
	float salary;

	ConstructorInheritance(String name, float salary) {
		super(name);
		this.salary = salary;
	}

	void display() {
		System.out.println(name + " and " + salary);
	}

	public static void main(String[] args) {
		ConstructorInheritance e1 = new ConstructorInheritance("MNC", 45000);
        e1.display();
	}
}
