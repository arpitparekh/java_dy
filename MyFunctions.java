
public class MyFunctions {

  // functions
  // function is block of code that runs when we called it

  static void maruFunction() { // function declaration // defination
    System.out.println("This is Display Function");
  }

  static void greeting(String name) {
    System.out.println("Hello " + name);
  }

  static void sum(int a, int b) {
    System.out.println("Sum is : " + (a + b));
  }

  // return type
  static int func() {
    return 30;
  }

  static float func2(float a, float b) {
    return a * b;
  }

  static float func3(float a, float b) {
    return a / b;
  }

  static void primeNumber(int num) {


    int flag = 0;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }

    if (flag == 0) {
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }

  }


  public static void main(String[] args) {

    System.out.println("Hello World");
    // line by line

    // parts of functions

    // function name
    // function parameter
    // function body
    // function return type

    maruFunction(); // calling of function
    maruFunction(); // calling of function
    maruFunction(); // calling of function
    maruFunction(); // calling of function
    maruFunction(); // calling of function

    greeting("Sumit");
    greeting("Pradip");
    greeting("Raj");

    sum(12, 13);
    sum(10, 23);
    sum(9, 43);

    // if function is returning something the whole function is consider as variable and function will became a value

    System.out.println(func());

    int result = 10 + func();
    System.out.println(result);

    float data = func2(10, 20);
    System.out.println(data);

    System.out.println(func2(func3(10, 20), func3(10, 20)));

    // func2 is higher order function

    primeNumber(13);
    primeNumber(20);
    primeNumber(17);
    primeNumber(19);

    System.out.println(Math.sqrt(144));

  }

}
