// MainMethod.java
package test;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    User user = new User();
    user.setAge(25);
    System.out.println(user.getAge());

    User name = new User();
    System.out.println("Enter first name of User");
    name.setFirstName(s.nextLine());
    System.out.println("Enter last name of User");
    name.setLastName(s.nextLine());
    System.out.println("Enter age of User");
    name.setAge(s.nextLine());
    System.out.println("Information of existing User");
    System.out.println("First Name" + "\t" + "Last Name" + "\t" + "Age");
    System.out.println(name.getFirstName() + "\t" + name.getLastName() + "\t" + name.getAge());
  }
}
