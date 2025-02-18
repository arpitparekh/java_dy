package oopc;

class Resto {

  static int no_of_staff;

  String name;
  String location;

  Resto(String name, String location) {
    this.name = name;
    this.location = location;
  }

}

public class StaticKeyword {

  public static void main(String[] args) {

    // static keyword

    Resto r1 = new Resto("McDonald", "Ahmedabad");
    Resto.no_of_staff = 100;
    Resto r2 = new Resto("KFC", "Ahmedabad");
    Resto r3 = new Resto("Burger King", "Ahmedabad");
    Resto r4 = new Resto("Dominos", "Ahmedabad");

  }

}
