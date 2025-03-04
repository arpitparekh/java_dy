import java.io.File;
import java.io.IOException;

public class FileHandling {

  public static void main(String[] args) {

    // File Halnding
    // Stream class
    // stream is a sequence of data
    // stream is used to read and write data from file
    // "Hello World"

    File f1 = new File("/home/arpit-parekh/files/abc.txt");
    try {
      System.out.println(f1.exists());
      f1.createNewFile();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // f1.delete();
    f1.renameTo(new File("/home/arpit-parekh/files/xyz.txt"));

  }

}
