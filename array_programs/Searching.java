package array_programs;

public class Searching {
  public static void main(String[] args) {

    int arr[] = { 12, 13, 15, 77, 45, 7, 8, 54 ,77};

    int element = 66;

    int flag = 0;

    for (int i = 0; i < arr.length; i++) {
      if (element == arr[i]) {
        flag = 1;
        break;
      }
    }

    if (flag == 1) {
      System.out.println("Element found");
    } else {
      System.out.println("Element not found");   // lee-near search
    }

  }
}
