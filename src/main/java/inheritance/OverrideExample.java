package inheritance;

class T {
  void show(int x) {
    System.out.println("in T.show, x is " + x);
  }
}

class U extends T {
//  @Override
//  void show(int x) {
  void show() {
    System.out.println("in U.show, x is " /*+ x*/);
  }
}
public class OverrideExample {
  public static void main(String[] args) {
    T aT = new U();
    aT.show(99);
  }
}
/*
A) in U....
B) in T....
C) runtime Exception
D) compiler error
 */