// Student.java
class Student {
	int rollno;
	String name;
	static String college = "MET";
	// private static value
	private static final double DEFAULT_INTEREST = 3.2;

	static void change() {
		college = "MGEIT";
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

    void display() {
    	System.out.println(rollno + " " + name + " " + college + " " + DEFAULT_INTEREST);
    }

    public static void main(String[] args) {
    	Student.change();
    	Student s1 = new Student(111, "AB");
    	Student s2 = new Student(122, "CD");
    	Student s3 = new Student(123, "EF");

    	s1.display();
    	s2.display();
    	s3.display();

        Student.college = "VJET";

        s1.display();
    	s2.display();
    	s3.display();

    	// Student.DEFAULT_INTEREST = 32; // cannot assign a value to final variable
    }
}
