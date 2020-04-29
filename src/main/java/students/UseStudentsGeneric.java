package students;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Criterion<E> {
  boolean test(E s);
}

class LongString implements Criterion<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

class SmartStudent2 implements Criterion<Student> {
  @Override
  public boolean test(Student s) {
    return s.getGrade() > 70;
  }
}

class EnthusiasticStudent2 implements Criterion<Student> {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 3;
  }
}

public class UseStudentsGeneric {
  // Object argument passed primarily for its BEHAVIOR (rather than state)
  // pattern is called "Command"
  public static <E> List<E> getByCriterion(List<E> ls,
                                           Criterion<E> crit) {
    List<E> out = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) {
        out.add(s);
      }
    }
    return out;
  }

  public static <E> void show(List<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("--------------------------");
  }

  public static void main(String[] args) {
    List<Student> roster = List.of(
        new Student("Fred", 78, "Math", "Physics"),
        new Student("Jim", 58, "Art"),
        new Student("Sheila", 98, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );
    show(getByCriterion(roster, new SmartStudent2()));
    show(getByCriterion(roster, new EnthusiasticStudent2()));

    show(getByCriterion(List.of("Fred", "Jim", "Sheila"), new LongString()));
    show(getByCriterion(List.of("Fred", "Jim", "Sheila"),
        new/* Anonymous inner/nested class
    class LongString implements */Criterion<String>() {
          @Override
          public boolean test(String s) {
            return s.length() < 5;
          }
        }
    ));
//    show(getByCriterion(List.of("Fred", "Jim", "Sheila"),
//        /*new Criterion<String>() {*/
//          /*@Override
//          public boolean test*/(String s) {
//            return s.length() < 5;
//          }
//        /*}*/
//    ));
    show(getByCriterion(List.of("Fred", "Jim", "Sheila"),
        (String s) -> { return s.length() < 5; }
    ));
  }
}
