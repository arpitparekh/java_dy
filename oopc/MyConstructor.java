package oopc;

public class MyConstructor {

  int a;
  int b;

  MyConstructor(int a1, int b1) {
    System.out.println("Constructor called");
    a = a1;
    b = b1;
  }

  void display() {
    System.out.println("A : " + a);
    System.out.println("B : " + b);
  }

  public static void main(String[] args) {

    // constructor
    // constructor is a special method which is used to initialize the object
    // constructor calls automatically when object is created
    // constructor name should be same as class name
    // constructor does not have a return type

    Component c = new Component("Laptop", 10000, 10);
    c.display();
    Component c1 = new Component("Mouse", 100, 20);
    c1.display();

    MyConstructor mc = new MyConstructor(10, 20);
    mc.display();

  }

}

class Component {
  String name = "";
  int price = 0;
  int quantity = 0;

  Component(String n,int p,int q) {   // parameterized constructor
    System.out.println("Constructor called");
    name = n;
    price = p;
    quantity = q;
  }

  void display() {
    System.out.println("Name : " + name);
    System.out.println("Price : " + price);
    System.out.println("Quantity : " + quantity);
  }

}


