public class Student {

  int age;
  float gps;
  private String firstName;
  private String lastName;
  String major;
  int age;

  public Student() {

  }

  public Student(String firstName, String lastname, int age) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  }

  public String fullName(){
    return this.firstName + " " + this.lastName;
  }
}
