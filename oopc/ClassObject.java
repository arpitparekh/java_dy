package oopc;

public class ClassObject {

  public static void main(String[] args) {

    // class and object
    // class is a blueprint it used to organize your code in different classes
    // everyfile have only only one public class

    // object is an instance of a class
    // to access class properties and methods we need objects
    Student s = new Student();
    s.name = "John";
    s.age = 20;
    s.height = 5.6f;
    s.address = "USA";
    s.email = "john@gmail.com";
    s.greeting();

    Student s1 = new Student();
    s1.name = "Pradip";
    s1.age = 21;

    System.out.println(s1.height);
    System.out.println(s1.address);

    Student s3 = new Student();
    s3.name = "John Bhai";

    s1.greeting();

  }

}


class Student {

  // variables  // properties
  // methods // behaviour
  String name = "";
  int age = 0;
  float height = 0.0f;
  String address = "";
  String email = "";

  void greeting() {
    System.out.println("Hello " + name);
  }

}
