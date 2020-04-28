package inheritance;

class R {
  int x;
  public R(int x){}
}
class S extends R {
  int x;
  private String blurb;
  public S(){
    this(doStuff(5)); // CAN call static members, CANNOT call on "this"
//    super(5);
//    blurb = "Initialization with " + 5;
  }

  public S(int x) {
    super(x);
    blurb = "Initliazation with " + x;
  }

  public void showX() {
    System.out.println(super.x);
  }
  public static int doStuff(int x) {return x;}
}
public class Constructions {
}
