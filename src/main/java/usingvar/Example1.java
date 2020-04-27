package usingvar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
//  var name = "Fred"; NONONO ONLY FOR METHOD LOCAL VARIABLES
  Map<String, List<Map.Entry<String, Long>>> m = new HashMap<>();

  // Normal function arguments are not "immediately initialized" so
  // this doesn't work
//  public static void doStuff2(var x) {}

  public static void doStuff(int [] ia) {
//    public int x = 9;
  }

  public void callMethod1() {
      StaticExample.doStaticStuff();
  }

  public static void main(String[] args) {
//    String s = new String("Hello");
    String s = "Hello";
//    s = 99;
    Map<String, List<Map.Entry<String, Long>>> m = new HashMap<>();
    var m2 = new HashMap<String, List<Map.Entry<String, Long>>>();

    var s2 = "Hello again";
//    s2 = 99; NOT JAVASCRIPT. Strongly STATICALLY typed...
//    var s3; //UNINITIALIZED NOT ALLOWED
//    s3 = "Again";

    int [] ia = {
        1,
        3,
        2,
    }; // UNAMBIGUOUS
    // NOT ALLOWED
//    var s4 = {1, 2, 3, 4}; // short array literal form is
//    doStuff({1, 2}); // NO!
    doStuff(new int []{1, 2});
    var s4 = new int[]{1, 2, 3, 4};
//    var ia2[] = new int[3]; // NO, ENTIRE TYPE must be "embedded" in var

//    Object [] oa = new Object[]{"Fred", "Jim", "Sheila"}; // OK
//    var oa = new Object[]{"Fred", "Jim", "Sheila"}; // OK
//    var oa = {"Fred", "Jim", "Sheila"}; // NOT OK
//    final var x = 99; // OK
    var x = 99;
    x += 10;
    var i = 0.99;
    var b = (byte)99; // how to reference a byte or short using var.
    byte b2 = 123;


    var s1 = 9.99;
    var s5 = s1 + x;
    System.out.println(s1);

    var y1 = 1.; // is a double
    System.out.println(y1);
  }

  public static void showX() {
    // System.out.println("value of x is"+ m); // non-static variable m cannot be referenced from a static context
  }
}

class StaticExample {
  public void method() {
    doStaticStuff();
    this.doStaticStuff(); // gives a warning not an error.
    StaticExample.doStaticStuff();
  }

  public static void doStaticStuff() {
  }
}

