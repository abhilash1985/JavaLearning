// PassObjectByReference2.java

public class PassObjectByReference2 {
	public static void main(String argv[]) {
		PassObjectByReference2 p = new PassObjectByReference2();
		p.amethod();
		p.amethod2();
	}

	public void amethod() {
		PassObjectByReference t = new PassObjectByReference();
		t.i = 10;
		System.out.println("Before another method: " + t.i); // 10
		another(t);
		System.out.println("After another method: " + t.i); // 20
	}

	public void another(PassObjectByReference t) {
		t.i = 20;
		System.out.println("In another method: " + t.i); // 20
	}

    // Primitive v Method Parameters
	public void amethod2() {
		int i = 10;
		System.out.println("Before another2 method: " + i); // 10
		another2(i);
		System.out.println("After another2 method: " + i); // 10
	}

	public void another2(int i) {
		i += 10;
		System.out.println("In another2 method: " + i); // 20
	}
}