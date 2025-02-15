package oopc;

class Subject {
  String name = "";
  int marks = 0;

  Subject(String n, int m) {
    name = n;
    marks = m;
  }
}

class Student1 extends Subject {
  Student1() {
    super("Maths", 100);
    System.out.println("Student");
  }
}

// class A1{
//   A1() {
//     System.out.println("A");
//     }
// }
// class B1 extends A1 {
//   B1() {
//     System.out.println("B");
//     }
// }

public class ConstructorwithInheritance {

  public static void main(String[] args) {

    // constructor with inheritance
    // child class default constructor or parameterized constructor always calls parent class default constrcutor automatically

    // B1 b1 = new B1();

    Student1 s1 = new Student1();
    System.out.println(s1.name);
    System.out.println(s1.marks);

  }

}
