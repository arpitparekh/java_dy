package oopc;

public class ExceptionHandlingClass {

  public static void main(String[] args) {

    // Exception Handling
    // Exception means abnormality

    int a = 10;
    try {
      System.out.println(a / 0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Hello World");

    // Throwable class
    // Exception class

    String name = null;
    // System.out.println(name.length());

    int arr[] = { 1, 2, 43 };
    // System.out.println(arr[3]);

    String str = "1234fgg";
    Integer num = 0;

    // num = Integer.parseInt(str); // to convert string to int
    // System.out.println(num);

    String data = "MeraData";
    // System.out.println(data.charAt(100));

  }

}
