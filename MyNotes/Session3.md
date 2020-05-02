## Java Modules

In Java SE are more than 8000 classes, and they are classes like:
 - Swing
 - Corba
 - XML
 ... Do you need them?
 
 Then there's a need to create "deployable code", that means to include JRE, 8 libs, ...
 
 It helps to create deployable package that aren't huge and don't require the end recipient to install their own
 JavaSE.
 
 java  -> ZIP (smaller)   includes java.base, java.desktop
 
 If it's smaller the class loader looks at fewer classes and that means it's quicker :)
 
 Dependency management:
 - Nobody knows that you use or what do you depend on in the old system, previous Java 9.
 - After Java9 in the new you have to be explicit of what are you using. (Version management, trust issues.)
 
 It doesn't support versioning.
 
 `Public` no longer means visible everywhere, it also controls reflection.
 
 ### To add Modules
 
 Notice that access is enforced at the package level.
 
 1. Add a `module-info.java` in the package.
 1. Add the module you need in the `module-info.java`. 
 ```java
module Service {
}
```

### Modular lib design
- Package(s) to expose classes and functionality to the world
- Using Modules to make packages hide their internal implementations.

### Command line
- Use command line:
-- Commands like `jdeps`, `jmod`, `jlink`; and parameters like `module-path`, `module`. 