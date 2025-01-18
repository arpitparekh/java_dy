public class ArraysClass {

  public static void main(String[] args) {

    // arrays is group of similar type of element

    int arr[] = { 12, 13, 15, 77, 45, 7, 8, 54 };
    //            0    1   2   3   4  5  6   7

    System.out.println(arr[3]);

    int arr1[] = {}; // empty array

    int arr2[] = new int[5]; // 0..4   // 4 byte

    // new keyword is use to allocate memory in ram

    double arr3[] = { 1.2, 4.5, 6.7, 8.0, 8.5 };

    // System.out.println(arr3[0]);
    // System.out.println(arr3[1]);
    // System.out.println(arr3[2]);
    // System.out.println(arr3[3]);
    // System.out.println(arr3[4]);

    for (int i = 0; i < arr3.length; i++) {

      System.out.println("[" + i + "] => " + arr3[i]); // string concat"i"nation <= true
    }

    


  }

}
