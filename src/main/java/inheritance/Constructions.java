package inheritance;

class R {
  public R(int x){}
}
class S extends R {
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
  public static int doStuff(int x) {return x;}
}
public class Constructions {
}
