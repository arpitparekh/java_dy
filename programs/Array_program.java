package programs;

public class Array_program {

  public static void main(String[] args) {

    /*
     * Given two same-sized arrays A[] and B[] (both arrays contain distinct
     * elements individually but may have some common elements), the task is to form
     * a third (or result) array of the same size.
     * The resulting array should have
     * maximum n elements from both arrays. It should have chosen elements of A[]
     * first, then chosen elements of B[] in the same order as they appear in
     * original arrays. If there are common elements, then only one element should
     * be present in res[] and priority should be given to A[].
     *
     */

    int arr1[] = { 1, 2, 3, 4, 5 ,6,7,8,9,10};  // 5
    int arr2[] = { 4, 5, 6, 7, 8,11,12,13,14 ,15};  // 5

    int arr3[] = new int[arr1.length + arr2.length];

    for (int i = 0; i < arr1.length; i++) { // 0 1 2 3 4 // 5 6 7 8 9

      arr3[i] = arr1[i];
    }

    for (int i = 0; i < arr1.length;i++) {

      // arr2[i]; // 4 // 5 // 6 // 7 // 8

      boolean b = false;

      for (int j = 0; j < arr3.length; j++) {

        if (arr3[j] == arr2[i]) { //
          b = true;
          break;
        }

      }

      if (b == false) {
        arr3[i + 5] = arr2[i];
      }

    }


    // for (int i = 0; i < arr1.length + arr2.length; i++) {

    //   System.out.println(arr3[i]);

    // }

    ///////////////////////////////////
    int count = 0;
    for (int i = 0; i < arr3.length; i++) {

      if (arr3[i] == 0) {
        count++;
      }
    }

    System.out.println("Duplicate Elements are is :"+count);

    int arr4[] = new int[arr3.length - count];

    // copy

    int index = 0; // 1 // 2

    for (int i = 0; i < arr3.length; i++) {


      if (arr3[i] != 0) {

        arr4[index] = arr3[i];
        index++;
      }

    }

    for (int i = 0; i < arr4.length; i++) {

      System.out.println(arr4[i]);

    }


  }

}
