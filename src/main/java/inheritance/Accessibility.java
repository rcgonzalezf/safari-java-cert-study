package inheritance;

class Base1 {
//  protected int x;
  void doBaseStuff() {System.out.println("doBaseStuff");}
}
class Sub1 extends Base1 {
  @Override
  void doBaseStuff() {System.out.println("doSubStuff");}
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}
public class Accessibility {
  public static void main(String[] args) {
    Base1 b = null;
    b.doBaseStuff();
  }
}
