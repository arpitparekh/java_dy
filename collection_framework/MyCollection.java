package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

interface MyInter {
  void fun();
}

interface MyInter1{
  void fun1();
}

interface MyInter2 extends MyInter1,MyInter {
  void fun2();
}

class Hello implements MyInter2 {




}

public class MyCollection {

  public static void main(String[] args) {

    // collection framework
    // collection is a group of objects

    // ArrayList // dynamic array // not thread safe
    // LinkedList // double linked list // not thread safe
    // Vector // thread safe
    // Stack // LIFO // thread safe
    // Hashset
    // HashMap

    LinkedList list = new LinkedList<>();
    list.add("list");  // String
    list.add(1); // Integer
    list.add(true); // Boolean
    list.add(1.2); // Float
    list.add(new Hello());

    System.out.println(list);
    System.out.println(list.get(2));

    list.remove(true);
    list.add("Must Majani list");
    System.out.println(list);

    list.set(2, false);
    System.out.println(list);


    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);

    Stack<Float> s = new Stack();
    s.add(21.34f);
    s.add(22.44f);
    s.add(11.34f);

    s.push(12.454f);
    s.pop();

    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(6);
    set.add(7);
    set.add(11);
    set.add(99);
    set.add(1);

    // does not take duplicate values
    System.out.println(set);


    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    list2.add(1);
    list2.add(2);
    list2.add(3);

    HashSet<Integer> set2 = new HashSet<>();
    set2.addAll(list2);
    System.out.println(set2);

    list2.clear();

    System.out.println(list2);

    // HashMap // key value pair

    HashMap<String, String> map = new HashMap<>();
    map.put("FirstName", "Sumit");
    map.put("LastName", "Kumar");
    map.put("Age", "22");
    map.put("Address", "Delhi");
    map.put("City", "Delhi");
    map.put("FirstName", "Amit");

    System.out.println(map.get("LastName"));
    System.out.println(map);

    map.replace("FirstName", "Arpit");
    System.out.println(map);

  }

}
