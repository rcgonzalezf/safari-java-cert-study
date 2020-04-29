package students;

import java.util.ArrayList;
import java.util.List;

interface StudentCriterion {
  boolean test(Student s);
}
class SmartStudent implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getGrade() > 70;
  }
}

class EnthusiasticStudent implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 3;
  }
}
public class UseStudents {
  // Object argument passed primarily for its BEHAVIOR (rather than state)
  // pattern is called "Command"
  public static List<Student> getByCriterion(List<Student> ls,
                                             StudentCriterion crit) {
  List<Student> out = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        out.add(s);
      }
    }
    return out;
  }
//  public static List<Student> getSmart(List<Student> ls, int threshold) {
//  List<Student> out = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getGrade() > threshold) {
//        out.add(s);
//      }
//    }
//    return out;
//  }

  public static void show(List<Student> ls) {
    for (Student s : ls) {
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
//    show(getSmart(roster, 70));
//    show(getEnthusiastic(roster, 3));
    show(getByCriterion(roster, new SmartStudent()));
    show(getByCriterion(roster, new EnthusiasticStudent()));
  }
}
