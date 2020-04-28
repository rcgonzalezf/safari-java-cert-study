package inheritance;

class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

public class Casting {
  public static void main(String[] args) {
    Base b = new Sub();//new Base();
//    b.doOtherStuff();
//    if (b instanceof Sub) {
      ((Sub)b).doOtherStuff(); // "Cast" -- "trust me, compiler, I'm an engineer"...
//    } else {
//      System.out.println("it's not a Sub");
//    }
  }
}
