// Triangle.java

class Triangle extends AbstractShape {
	void draw() {
		System.out.println("drawing Triangle");
	}

	public static void main(String[] args) {
		AbstractShape s = new Triangle();
		s.draw();
	}
}
