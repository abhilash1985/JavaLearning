// Overriding.java

class Overriding extends FirstClass {
	public static void main(String[] args) {
		Overriding f1 = new Overriding();

		System.out.println(f1.getWeight()); // returns 0

		f1.setWeight(100);

		System.out.println(f1.getWeight()); // returns 1100
	}

	private int weight;
	public int getWeight() {
		return weight * 10;
	}

	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight + 10;
		}
	}
}
