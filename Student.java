// Student.java
class Student {
	int rollno;
	String name;
	static String college = "MET";
	static void change() {
		college = "MGEIT";
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

    void display() {
    	System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
    	Student.change();
    	Student s1 = new Student(111, "AB");
    	Student s2 = new Student(122, "CD");
    	Student s3 = new Student(123, "EF");

    	s1.display();
    	s2.display();
    	s3.display();
    }
}
