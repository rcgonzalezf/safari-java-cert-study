package abstractstuff;

abstract class P {
  private int x;

  void doMoreStuff() {
    System.out.println("Hello from P");
  }

  abstract void doStuff();
}

class Q extends P {
  void doMoreStuff() {
    super.doMoreStuff();
    System.out.println("Hello from Q");
  }
  void doStuff(){}
}

public class Q8 {
  public static void main(String[] args) {
    new Q().doMoreStuff();
  }
}
