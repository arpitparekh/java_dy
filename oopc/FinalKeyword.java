package oopc;
final class Funtoos {

  final int a;

  Funtoos(int a) {
    this.a = a;
  }

  final void display() {
    System.out.println("hola funtoos");
  }

}

// class Rumtoos extends Funtoos {

// }

public class FinalKeyword {

  public static void main(String[] args) {

    // final
    Funtoos fun = new Funtoos(12);
    System.out.println(fun.a);

  }

}
