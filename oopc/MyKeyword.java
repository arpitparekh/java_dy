package oopc;

class Indus {

  int no_of_student;
  String location;
  float rating;


  Indus(int no_of_student, String location, float rating) {
    this(12);
    this.no_of_student = no_of_student;
    this.location = location;
    this.rating = rating;
  }

  Indus(int a) {
    System.out.println("Default constrcutor with "+ a);
  }

  void display() {
    this.fun();
    System.out.println(no_of_student + " " + location + " " + rating);
  }

  void fun() {
    System.out.println("Hello World");
  }

}

public class MyKeyword {
  public static void main(String[] args) {

    // keywords in java

    // this
    // this referes to the current class instance(object)
    // calling same class constrcutor into another  constructor of a same class

    // super
    // static
    // final

    Indus in = new Indus(1000, "Ahmedabad", 3.9f);
    in.display();

  }
}


