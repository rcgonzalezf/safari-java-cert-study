# Oracle Java SE Programmer I Crash Course:
Pass the 1Z0-815 or 1Z0-808 Exams
Presented by Simon Roberts
Learning:

* 7 Key Points cycle to learn stuff. Repeat.

1. 1 Key Point
1. 2 Key Point
1. 3 Key Point
1. 4 Key Point
1. 5 Key Point
1. 6 Key Point
1. 7 Key Point

### Variables Java 11:

- Use `var` does it make your code easier to read?
  - Stylistically, easy to read for someone else, less visual clutter.
```java
Map<String, List<Map.Entry<String, Long>> = new
HashMap<>();

var m2 = new HashMap<String, List<Map.Entry<String, Long>>>();

// the scence the type of s2 is fixed.
var s2 = "Hello again";
// s2 = 99; don't compile, Not JS. Strongly  Statically Typed.
// Infered at initialization type, we must initialize the variable.
// Uninitialized not allowed

// var s4 = {1, 2, 3, 4}; // not allowed - short array form not allowed
// array initialization is allowed but you have to be specific
// var ia2[] = new int[2]; // Not allowed, entire type must be embedeed in var, not var ia2[]
 
var s4 = new int[] {1,2,3,4};
int []ia = {1,2,3,}; // allowed even with trailing comma at the end, unambiguous.
// trailing commas are allowed in enums, arrays, and try-with-resources, not in Array as list because is a method parameter.

var x = 99; // var isn't final
var final y = 100; // OK
x = 100; // OK
// y = 2; // not ok, is final.


public class Example1 {
    // var name = "Fred"; /// NO, NO, NO only for method local variables. Not allowed outside a method.
    // TODO check if var is allowed to be inside of constructor to pass the value to a field.
    public static void doStuff(int[] ia ){}
    public static void main(String[] args) {
    }
}

```

Static methods can access instance fields. Yes they can, think about:

```java
public static doStuff(MyStuff ms) { int x = ms.x; }
// this is legal
```

`this` exits only in instance methods, <--- fact.

```java
package usingstatic;

public class Ex1 {
    private int x = 99;
    public static void showX() {
         // "x" is an "unqualified" identifier...
         // - is x used as var, or function? variables don't end with () functions do!
         // FOR VARS
         // is it method local (including constructor local)
         // if not: is it a field in "this" -- only if it's an instance method 
         //   also tries up the class hierarchy (because of inheritance).
         // if not: is it a static field in "TheClass" -- i.e. try
         //   the classname as a prefix
         //   try up the class hierarchy
         System.out.println("value of x is"+ this.x);
    } 
}
``` 

[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project java-cert-study: Compilation failure
[ERROR] safari-java-cert-study/src/main/java/usingvar/Example1.java:[52,41] non-static variable m cannot be referenced from a static context