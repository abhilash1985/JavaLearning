// StaticMethods.java
// Looks like normal class

public interface StaticMethods {
	public static void main(String[] args) {

	}

	public static boolean isNull(Object obj) {
		return obj == null;
	}
}

class Triangle implements StaticMethods {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.isNull(t);
	}
}
