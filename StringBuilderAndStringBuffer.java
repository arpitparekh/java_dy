public class StringBuilderAndStringBuffer {

  public static void main(String[] args) {

    // String buffer and String builder
    String name = "Hello";
    // string are immutable
    System.out.println(name);

    StringBuffer sb = new StringBuffer("Hello"); //  thread safe
    StringBuilder sb1 = new StringBuilder("Hello"); // not thread safe
    // string buffer anf string builders are the mutable strings
    System.out.println(sb);
    sb.append(" World");
    sb.reverse();
    System.out.println(sb);
  }

}
