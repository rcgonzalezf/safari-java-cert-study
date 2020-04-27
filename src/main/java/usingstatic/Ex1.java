package usingstatic;

public class Ex1 {
  private String thing;
  public Ex1(String thing2) {
//    this.thing = thing;
    thing = thing2;
  }

  private /*static */int x = 99;

  public static void showX() {
    // "x" is an "unqualified" identifier...
    // - is x used as var, or function? variables don't end with () functions do!
    // FOR VARS
    // is it method local (including constructor local)
    // if not: is it a field in "this" -- only if it's an instance method
    //   also tries up the class hierachy (because of inheritance)
    // if not: is it a static field in "TheClass" -- i.e. try
    //   the classname as a prefix
    //   try up the class hierarchy
//    System.out.println("value of x is " + x);
  }

}
