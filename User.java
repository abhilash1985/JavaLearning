// User.java
public class User {
  public String fname;
  public String lname;
  public int age;

  public String getFirstName() {
    return fname;
  }

  public void setFirstName(String fname) {
    this.fname = fname;
  }

  public String getLastName() {
    return lname;
  }

  public void setLastName(String lname) {
    // String lname = String.valueOf(lname);
    this.lname = lname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
