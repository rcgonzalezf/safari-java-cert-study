package students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class UseFunctInterfaces {
  public static void main(String[] args) {
    Consumer<String> cs = s -> System.out.println(s);
    Supplier<String> ss = () -> LocalDate.now().toString();
    Function<String, Integer> fsi = s -> s.length();
    ToIntFunction<String> fsi2 = s -> s.length();

    List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));

    names.forEach(cs);
    System.out.println("---------------------");
    names.forEach(s -> System.out.println(s));
    System.out.println("---------------------");
    names.stream()
        .map(fsi)
        .forEach(i -> System.out.println(i));

    names.sort(
        (s1, s2) -> s2.compareTo(s1)
    );

    System.out.println(names);

    List<Student> roster = new ArrayList<>(List.of(
        new Student("Fred", 78, "Math", "Physics"),
        new Student("Jim", 58, "Art"),
        new Student("Sheila", 98, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    ));

    roster.sort((s1, s2) -> s2.getGrade() - s1.getGrade());
    System.out.println(roster);
  }
}
