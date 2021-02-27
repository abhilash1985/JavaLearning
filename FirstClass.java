// FirstClass.java

public class FirstClass {
	public static void main(String[] args) {

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
