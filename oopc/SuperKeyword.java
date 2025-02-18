package oopc;

class Super {

  int year;
  String name;

  Super(int year, String name) {
    this.year = year;
    this.name = name;
  }

}

class Sal extends Super {

  int salary;

  Sal(int salary,int year, String name) {
    super(year,name);
    this.salary = salary;
  }

}

public class SuperKeyword {

}
