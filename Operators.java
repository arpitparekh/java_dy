

public class Operators {

  public static void main(String[] args) {

    // operators
    // operators are the symbols that are used to perform operations on variables and values

    // arithmetic operators
    // + - * /  %(modulo)

    int a = 10;
    int b = 20;

    int c = a + b;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b); // 10 / 20  // 0

    float d1 = 10f;
    float d2 = 20f;

    System.out.println(d1 / d2);

    int x = 11;
    int y = 5;

    // modulo % will give the remainder

    System.out.println(x % y);

    System.out.println(12 % 13);

    System.out.println(1234%10);  // if you modulo any number by 10, the remainder will be the last digit of the number.

    System.out.println(1234 / 10); // remove the last digit of the number and divide the remaining number by 10.

    // assignment operators
    // =  +=  -=  *=  /=  %=

    int m = 15;

    m = 17;   // reinitialize the value of m

    System.out.println(m); // 17

    m += 2;
    // m = m + 2;

    System.out.println(m);  // 19

    m/=2     ; // m = m / 2
    System.out.println(m);  // 9

    m %= 3;
    System.out.println(m); // 0


    // (relational operators)
    // ==  !=  >  <  >=  <=   // boolean values returned by these operators
    System.out.println(10 == 10);
    System.out.println(10 != 10);

    boolean b1 = 10 == 12; // b1 becames false
    System.out.println(b1);

    // == is also called as equality operator

    // logical operators
    //  &&   ||   !

    // used between 2 or more relational operators
    // also gives boolean value

    boolean bool = 12 <13 && 12 < 14 && 10 > 15;
    System.out.println(bool);

    boolean bool2 = 12 <13 || 12 < 14 || 10 > 15;
    System.out.println(bool2);

    boolean bool3 = (12 < 13);
    System.out.println(!bool3);

    // increment decrement operators
    // ++ --

    int i = 10;
    i++;
    System.out.println(i); // 11

    int j = 1;
    j--;
    System.out.println(j);


    int p = 15;
    System.out.println(p++);
    System.out.println(p);

    int q = 16;
    System.out.println(++q);
    System.out.println(q);

    int r = 10;
    System.out.println(r--);
    System.out.println(r);

    int s = 11;
    System.out.println(--s);
    System.out.println(s);

  }

}
