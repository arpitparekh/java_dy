import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
  public static void main(String[] args) {


    // Read and Write file
    // Stream class
    // ByteStram and CharacterSteram

    System.out.println();

    // ByteStream
    // FileInputStream // read
    // FileOutputStream // write

    // CharacterStream
    // FileReader // read
    // FileWriter // write

    File file = new File("/home/arpit-parekh/files/mariFile.txt");

    File file2 = new File("/home/arpit-parekh/files/tariFile.txt");
    try {

      FileOutputStream fos = new FileOutputStream(file);
      String name = "Bascom Bridge";
      fos.write(name.getBytes());   // string to byte array
      fos.close();
      System.out.println("Done");

      FileInputStream fis = new FileInputStream(file);
      byte arr[] = new byte[fis.available()];
      fis.read(arr);
      String result = new String(arr); // byte array to string
      System.out.println(result);
      fis.close();

      FileWriter fw = new FileWriter(file2);
      String name2 = "Bascom Bridge Institute";
      fw.write(name2);
      fw.close();
      System.out.println("Done");

      FileReader fr = new FileReader(file2);

      while(fr.ready()) {
        System.out.println((char)fr.read());
      }
      fr.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }


  }
}
