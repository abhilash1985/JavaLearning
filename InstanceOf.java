// InstanceOf.java

class InstanceOf {
	public static void main(String[] args) {
		InstanceOf i = new InstanceOf();
		FirstClass f = new FirstClass();
		Inheritance ih = new Inheritance();
		Overloading ol = new Overloading();
		Overriding or = new Overriding();

        i.printInstance(f);
        i.printInstance(ih);
        i.printInstance(ol);
        i.printInstance(or);
	}

	public void printInstance(FirstClass f) {
		if(f instanceof Inheritance) {
			System.out.println("Instance of Inheritance");
		} else if(f instanceof Overloading) {
            System.out.println("Instance of Overloading");
		} else if(f instanceof FirstClass) {
            System.out.println("Instance of FirstClass");
		} else {
			System.out.println("Class not found");
		}
	}
}
