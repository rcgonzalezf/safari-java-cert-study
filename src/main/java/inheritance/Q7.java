package inheritance;
class P /*extends Object*/ {
  private int x;
//  public P() {}
  public P(int v) {
    x = v;
    System.out.println("in P constructor");
  }
}
class Q extends P {
  // IF a class has ZERO coded constructors
  // Compiler creates "default" constructor
//  /* accessibility from class accessibility */ Q() {
//    super();
//  }

  // explicit constructor
  Q() {
    super(5);
  }
}

public class Q7 {
  public static void main(String[] args) {
    P p = new Q();
  }
}
