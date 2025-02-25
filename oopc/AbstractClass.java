package oopc;

abstract class Animal {

  String name;
  int age;
  int legs;

  void eating() {
    System.out.println(name + " is eating");
  }

  abstract void makeSound();

}

class Dog extends Animal {

  @Override
  void makeSound() {
    System.out.println("Woof");
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Legs: " + legs);
  }

}

interface MyInterface {

  void running();
  void walking();
  void swimming();

}

class MeraClass extends Animal implements MyInterface {

    @Override
    public void running() {
      System.out.println("Running");
    }

    @Override
    public void walking() {
      System.out.println("Walking");

    }

    @Override
    public void swimming() {
      System.out.println("Swimming");
    }

    @Override
    void makeSound() {
      System.out.println("Meow");
    }

}



public class AbstractClass {

  public static void main(String[] args) {

    // abstract class is just like a normal class but it has atleast one abstract
    // method
    // abstract class can't be instantiated
    // abstract class can have abstract methods and non-abstract methods
    // abstract class is used to give implementation to the other class
    // abstract function is a function that has no body
    // interface is a collection of abstract method

    Dog d = new Dog();
    d.name = "Dog";
    d.age = 10;
    d.legs = 4;
    d.eating();
    d.makeSound();
    d.display();

    // Thread // // wrapper class
    // File Handling
    // Exception Handling
    // Collection Framework
    // Generitc

    // 2 * 3
    int arr[][] = { { 1, 3 }, { 3, 4, 5 }, { 1 } }; // 3 * 2

    /*
     * This is called a Jagged Array (also known as Ragged Array). It's a
     * 2-dimensional array where each row can have a different number of columns. In
     * this specific example:
     *
     * First row has 2 elements: {1,3}
     * Second row has 3 elements: {3,4,5}
     * Third row has 1 element: {1}
     * This is different from a regular rectangular 2D array where all rows must
     * have the same number of columns. Jagged arrays are useful when you need to
     * store data that naturally has varying lengths per row.
     *
     * The comment in the code suggests "3 * 2" but that's not accurate since this
     * is a jagged array with varying column lengths for each row.
     */

  }

}
