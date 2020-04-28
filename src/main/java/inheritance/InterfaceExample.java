package inheritance;

interface TheInterface {
  int MAX_COUNT = 100; // public, static, and final Java 1 onwards
  void doStuff(); // public and abstract -- Java 1 onwards
  static void sayHello() { // public Java 8 onwards
    System.out.println("Hello");
  }
  default void showIt() {
    System.out.println(this); // default method is INSTANCE
    // "this" we only know about this interface.
    this.doStuff();
  }
  private void helpMe() { // Java 9 onwards just a "helper"
    this.doStuff();
  }
}

public class InterfaceExample {
  public static void main(String[] args) {
    TheInterface ti = null;
//    ti.sayHello();
    TheInterface.sayHello();
  }
}
