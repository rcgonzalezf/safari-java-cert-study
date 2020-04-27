package usingstatic;

class Y {
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}

class Z extends Y { // Liskov substution principle
  static String sayHi() { return "Z-Hello"; }
  String sayHi2() { return "Z-Hello2"; }
}

public class Q5 {
  public static void main(String[] args) {
    Y y = new Z();
    System.out.println(y.sayHi() + ", " + y.sayHi2());
  }
}
