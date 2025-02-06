class Student {
  String name = "";
  int age = 0;
  float height = 0.0f;
  String address = "";
  String email = "";

  Student(String n, int a, float h, String add, String e) {
    name = n;
    age = a;
    height = h;
    address = add;
    email = e;
  }

  void display() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Height : " + height);
    System.out.println("Address : " + address);
    System.out.println("Email : " + email);
  }

}
