public class Student {
  float gps;
  String firstName;
  String lastName;
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
