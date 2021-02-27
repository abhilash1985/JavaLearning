// TypeCasting.java

class TypeCasting {
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
			// System.out.println("Instance of Inheritance");
			f.setWeight(200);
			System.out.println(f.getWeight());
		} else if(f instanceof Overloading) {
            // System.out.println("Instance of Overloading");
            Overloading ol = (Overloading) f;
            ol.setWeight(150, 10);
			System.out.println(f.getWeight());
		} else if(f instanceof FirstClass) {
            // System.out.println("Instance of FirstClass");
            f.setWeight(350);
			System.out.println(f.getWeight());
		} else {
			System.out.println("Class not found");
		}
	}
}