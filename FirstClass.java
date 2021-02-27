// FirstClass.java

public class FirstClass {
	public static void main(String[] args) {
		FirstClass f1 = new FirstClass();

		System.out.println(f1.getWeight()); // returns 0

		f1.setWeight(100);

		System.out.println(f1.getWeight()); // returns 100
	}

	private int weight;
	public int getWeight() {
		return weight;
	}

	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		}
	}
}
