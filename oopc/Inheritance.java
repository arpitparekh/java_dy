
class Parent {   // base class // super class

  float propertysqf = 0.0f;
  int no_cars = 0;

}

class Child extends Parent { // derived class // sub class

  String name;
  int age;

  void display() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Propertysqf : " + propertysqf);
    System.out.println("No_cars : " + no_cars);
  }

}

// multilevel inheritance
class A{

}
class B extends A{

}

class C extends B{

}

// heirarchical inheritance
// one parent multiple children
class P {

}

class Q extends P{

}

class R extends P {

}

// multiple inheritance
// mere dodo baap
// 2 parent one child
// in java multiple inheritance is not supported
// but can use interface to solve it
// because of diamond problem

class L {

}

class M {

}

// class N extends L,M{

// }



public class Inheritance {

  public static void main(String[] args) {

    // Inheritance
    // one class can take variables or functions from another class

    Child c = new Child();
    c.name = "John";
    c.age = 20;
    c.propertysqf = 1000.0f;
    c.no_cars = 2;

    c.display();

  }

}
