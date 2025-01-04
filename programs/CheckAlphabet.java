package programs;

public class CheckAlphabet {

  public static void main(String[] args) {

    // Write a program to check whether a character is in the alphabet or not.

    char ch = 'A';

    if ( (ch <= 'z' && ch >= 'a') || (ch<= 'Z' && ch >= 'A') ) {
      System.out.println("Alphabet");
    } else {
      System.out.println("Not Alphabet");
    }

  }

}
