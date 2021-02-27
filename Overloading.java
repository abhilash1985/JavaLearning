// Overloading.java

class Overloading extends FirstClass {
	String color = "white";

	public static void main(String[] args) {
		Overloading f1 = new Overloading();

		System.out.println(f1.getWeight()); // returns 0

		System.out.println(f1.getWeight2()); // returns 0.0

		f1.setWeight(100, 5); // prints 500

		System.out.println(f1.getWeight()); // returns 500

		f1.setWeight2(100, 5); // prints 500.0

		System.out.println(f1.getWeight2()); // returns 0

		f1.printColor();

		f1.printKeyword();
	}

	private float weight2;
	public float getWeight2() {
		return weight2;
	}

	public void setWeight2(float newWeight, float interest) {
		if(newWeight > 0) {
			float weight2 = newWeight * interest;
			System.out.println(weight2); // returns 500.0
		}
	}

    private int weight;
    public int getWeight() {
		return weight;
	}

	public void setWeight(int newWeight, int interest) {
		if(newWeight > 0) {
			weight = newWeight * interest;
			System.out.println(weight); // returns 500
		}
	}

    // Super keyword
	public void printColor() {
		System.out.println(color); // returns white
		System.out.println(super.color); // returns black
	}

	// this keyword
	public void printKeyword() {
		System.out.println(this); // returns reference ID
	}
}
