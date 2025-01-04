public class Loops {

  public static void main(String[] args) {

    // three types of loop
    // while loop
    // do while
    // for loop

    // to do any repetative task

    // 1. intial value
    // 2 condition
    // 3 increment or decrement

    // while loop

    int a = 10;

    while (a <= 20) { // one itteration <= write spelling <= always tree <= true
      System.out.println(a);
      System.out.println("Hola");
      a++;
    }

    ////////////////////////////////// english ko nai feeling ko samjo  // do while

    int b = 50;

    do {

      System.out.println(b);
      b++;

    } while (b <= 55);

    // even if the condition is false at the first itteration, it will execute the loop at least once

    // for loop  // for (initialization; condition; increment/decrement)
    for(int i=1;i<=10;i++){
      System.out.println(i);
    }

    // 1..100
    // 100..1

  }

}
