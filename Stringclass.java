class StringClass {

  public static void main(String[] args) {

    String name = "Hello";

    // string functions

    // string manipulation
    for(int i=0;i<name.length();i++){  // 0 1 2 3 4
      System.out.println(name.charAt(i));   // name[i]
    }

    System.out.println(name.charAt(3)); // l
    System.out.println(name.codePointAt(3));  // 10101 // H e l l o

    String name2 = "hello";

    System.out.println(name.compareTo(name2));   // equals method gives boolean
    System.out.println(name.compareToIgnoreCase(name2)); // equalsIgnoreCase()

    String name3 = "Bascom";
    System.out.println(name2.concat(name3));
    System.out.println(name2 + name3);

    System.out.println(name3.contains("Bas"));

    System.out.println(name3.endsWith("jpg"));

    String name4 = "Hello %d %f";
    System.out.println(String.format(name4, 10, 20f));

    byte[] arr = name3.getBytes();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println(name3.indexOf("om"));

    String name5 = "";
    System.out.println(name5.isEmpty());

    String name6 = "Bridge";
    System.out.println(String.join("=>", name3, name6,"Welcome"));

    String data = "Hello World";
    System.out.println(data.lastIndexOf('o'));

    System.out.println(data.replace("l", "f"));

    String[] myArr = data.split(" ");

    // substring()
    System.out.println(data.substring(2, 4));

    int a = 12;
    System.out.println(String.valueOf(a));

    String url = "https://cdn.pixabay.com/photo/2023/12/05/08/14/woman-8431035_1280.xlsx";

    System.out.println(url.lastIndexOf("."));
    String urlExtension = url.substring(url.lastIndexOf(".")+1, url.length());
    System.out.println(urlExtension);

  }

}
