package oopc;


class Market {

  String name = "";
  int price = 0;
  int quantity = 0;

  void assignValues(String n, int p, int q) {
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

public class AssignValues101 {

  public static void main(String[] args) {

    Market m1 = new Market();
    m1.assignValues("Apple", 100, 12);

    Market m2 = new Market();
    m2.assignValues("Banana", 50, 20);

    m1.display();
    m2.display();

  }

}
