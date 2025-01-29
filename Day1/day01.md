# Core Java

## Trainer Introduction
* Trainer: Ketan G Kore
* Qualification: M.Sc. Computer Science 

## Course Introduction


## Course contents -- Java 8
* Language features (Installation, Buzzwords, History, JRE/JDK/JVM, Compilation, Operators, Data types, Narrowing/Widening)
* Control Structures (if-else, loops, switch, recursion, wrapper classes, boxing, value/reference type)
* Input/Output: Commandline args, Scanner, Console
* OOP basics (OOP pillars, class/object, class methods, ctor chaining, overloading, final field, toString()), enum
* Static (static fields/method/block), Singleton, Package (classpath), static import
* Arrays (1-D & 2-D array, primitive and object array, java.util.Arrays)
* OOP advanced (aggregation/association/composition, Inheritance, super, Method overriding, instanceof, final method/class, Abstract class, Java 7 Interfaces, Marker interfaces)
* Java classes (java.lang.Object, Date/LocalDate/Calendar, String/StringBuilder/StringBuffer, etc)
* Exception Handling (try-catch-throw, throws, finally, try-with-resource/Closeable, errors, custom exception, checked/unchecked, overriding rules)
* Java Generics (methods, classes, interfaces), Comparable/Comparator interface, Java 8 Interfaces
* Nested classes, Functional Interfaces, Lambda expressions, Method references
* Java Collections (Hierarchy, Lists, Iterator, Sets, Maps, Queue/Stack, Fail-safe/Fail-fast Iterators, Legacy collections, Collections)
* Functional programming (Concepts, Java 8 interfaces, Stream characteristics, Stream operations, Collectors)
* Java IO (Binary vs Text streams, File IO, Stream chaining, Data stream, Serialization, Reader/Writers)
* Multi-threading (Thread vs Runnable, thread methods, Thread group, Synchronization, Deadlock)
* JVM Architecture, Reflection, Annotation, Garbage Collection

## Reference Books
* Core Java Volume 1 & 2 - Horstmann
* Java Complete Reference - Herbert Schildt
* Java 8 Certification - Khalid Mughal
* Java Certification - Kathy Sierra

## Day 01 Agenda
* Java history
* Java versions
* Java platforms
* Java Installations
* Hello World
* C++ vs Java Compilation and Execution
* JDK vs JRE vs JVM

## Java History
* Java goes back to 1991, when a group of Sun engineers, led by Patrick Naughton and James Gosling, wanted to design a small computer language that could be used for consumer devices like cable TV switchboxes. 
* Since these devices do not have a lot of power or memory, the language had to be small and generate very tight code. Also, as different manufacturers may choose different CPU's, it was important that the language not be tied to any single architecture.
* The project was code-named "Green".
* The requirements for small, tight, and platform-neutral code led the team to design a portable language that generated intermediate code for a virtual machine.
* The Sun people came from a UNIX (Solaris) background, so they based their language on C++.
* Gosling decided to call his language "Oak". However, Oak was the name of an existing computer language, so they changed the name to Java.
* In 1992, the Green project delivered its first product, called "*7" - a smart remote control.
* Unfortunately, Sun was not interested in producing this, and the Green people had to find other ways to market their technology. However, none of the standard consumer electronics companies were interested either.
* The Green team spent all of 1993 and half of 1994 looking for sponsors to buy its technology.
* Meanwhile, the World Wide Web (WWW) was growing bigger and bigger. The key to the WWW was the browser translating hypertext pages to the screen.
* In 1994, most people were using Mosaic, a noncommercial web browser by University of Illinois.
* The Java language developers developed a cool browser - HotJava browser. This was client/server architecture-neutral application that was real-time and reliable.
* The developers made the browser capable of executing Java code inside web pages - called Applets. This POC was demonstrated at SunWorld on 23-May-1995.

## Java versions
* JDK Beta - 1995
* **JDK 1.0 - January 23, 1996**
* JDK 1.1 - February 19, 1997
* **J2SE 1.2 - December 8, 1998**
    * Java collections
* J2SE 1.3 - May 8, 2000
* J2SE 1.4 - February 6, 2002
* **J2SE 5.0 - September 30, 2004**
    * enum
    * Generics
    * Annotations
* Java SE 6 - December 11, 2006
* Java SE 7 - July 28, 2011
* **Java SE 8 (LTS) - March 18, 2014**
    * Functional programming: Streams, Lambda expressions
* Java SE 9 - September 21, 2017
* Java SE 10 - March 20, 2018
* **Java SE 11 (LTS) - September 25, 2018**
* Java SE 12 - March 19, 2019
* Java SE 13 - September 17, 2019
* Java SE 14 - March 17, 2020
* Java SE 15 - September 15, 2020
* Java SE 16 - March 16, 2021
* **Java SE 17 (LTS) - September 14, 2021**
    * Jakarta SE 17
* Java SE 18 - March 22, 2022
* Java SE 19 - September 20, 2022
* Java SE 20 - March 21, 2023
* Java SE 21 - ??

## Java platforms
* Java is not specific to any processor or operating system as Java platforms have been implemented for a wide variety of hardware and operating systems with a view to enable Java programs to run identically on all of them. Different platforms target different classes of device and application domains:
* **Java Card**: A technology that allows small Java-based applications to be run securely on smart cards and similar small-memory devices.
* **Java ME (Micro Edition)**: Specifies several different sets of libraries (known as profiles) for devices with limited storage, display, and power capacities. It is often used to develop applications for mobile devices, PDAs, TV set-top boxes, and printers.
* **Java SE (Standard Edition)**: Java Platform, Standard Edition or Java SE is a widely used platform for development and deployment of portable code for desktop environments
* **Java EE (Enterprise Edition)**: Java Platform, Enterprise Edition or Java EE is a widely used enterprise computing platform. The platform provides an API and runtime environment for developing and running enterprise software, including network and web services, and other large-scale, multi-tiered, scalable, reliable, and secure network applications.

## Java Installations

### JDK
* Windows and Mac:
    * https://adoptium.net/temurin/releases/?version=11
    * Download .msi/.dmg file and follow installation steps.
* Ubuntu:
    * terminal> sudo apt install openjdk-11-jdk
* Directory structure of JDK
    * Windows: C:\Program Files\Eclipse Adoptium\jdk-11.0.15.10-hotspot
    * Ubuntu: /usr/lib/jvm/java-11-openjdk-amd64
        ```
        jdk-8.0.372.7-hotspot
            |- bin: The compiler, application launcher and other java tools.
            |- docs: Library documenation in HTML format.
            |- include: Files for compiling native methods.
            |- jre: Java runtime environment files.
            |- lib: Library files.
            |- src.zip: Java library source code
        ```

### Eclipse STS 4.x
* https://spring.io/tools
* Download latest STS and extract it.

### Documentation
* https://www.oracle.com/java/technologies/javase-jdk11-doc-downloads.html

## Object Oriented
* Basic principles of Object-oriented Language
    * class
    * object
* class
    * User defined data type (similar to struct in C)
    * Has fields (data members) and methods (member functions)
        * static members: Accessed using class name directly
        * non-static members: Accessed using object
    * Defines the structure/blueprint of the created object/instance
    * Logical entity
* object
    * Instance of the class
    * One class can have multiple objects
    * Physical entity (occupies memory)

## Hello World - Code, Compilation and Execution
* Code
    ```Java
    // Program.java
    class Program {
        public static void main(String args[]) {
            System.out.println("Hello, World!");
        }
    }
    ```
* Explanation - main():
    * In Java, each variable/method must be in some class.
    * JVM calls main() method without creating object of the class, so method must be static.
    * main() doesn't return any value to JVM, so return type is void.
    * main() takes command line arguments - String args[]
    * main() should be callable from outside the class directly - public access.
* Explanation - System.out.println():
    * System is predefined Java class (java.lang.System).
    * out is public static field of the System class --> System.out.
    * out is object of PrintStream class (java.io.PrintStream).
    * println() is public non-static method of PrintStream class --> System.out.println("...");
* Compilation and Execution (in same directory)
    * terminal> javac Program.java
    * terminal> java Program

### Entry point method
* main() is considered as entry poit method in java.
    ```Java
    public static void main(String[] args) {
        // code
    }
    ```
* JVM invokes main method.
* Can be overloaded.
* Can write one entry-point in each Java class.

### java.lang.System class
    ```Java
    public final class System
    {
        //Fields
        public static final InputStream in;     // stdin
        public static final PrintStream out;    // stdout
        public static final PrintStream err;    // stderr
        //Methods
        public static Console console();
        public static void exit(int status);
        public static void gc();
        // ...
    }
    ```

### System.out.println()
* System: Final class declared in java.lang package and java.lang package is declared in rt.jar file.
* out: Object of PrintStream class declared as public static final field in System class.
* println(): Non-static method of PrintStream class.

## C/C++ Program Compilation and Execution
* Main.cpp --> Compiler --> Main.obj --> Linker --> Main.exe
    * Main.cpp - Source code
    * Main.obj - Object code
    * Main.exe - Program = Executable code (contains machine level code)
* terminal> ./Main.exe
* Operating system creates a process to execute the program.
* Process sections
    * Text:
    * Data:
    * Rodata: 
    * Stack: 
    * Heap

## Java Program Compilation and Execution
* Main.java --> Compiler --> Main.class --> JVM
    * Main.java --> Source code
    * Main.class --> Byte code (Intermediate Language code)
* terminal> javac Main.java
* terminal> java Main

## JDK vs JRE vs JVM
* SDK is Software Development Kit required to develop application.
* SDK = Software Development Tools + Libraries + Runtime environment + Documentation + IDE.
    * Software Development Tools = Compiler, Debugger, etc.
    * Libraries = Set of functions/classes.
* JDK is Java platform SDK. It is a software development environment used for developing Java applications.
* JDK = Java Development Tools + JRE + Java docs.
    * Required to develop Java applications.
* JRE = Java API (Java class libraries) + Java Virtual Machine (JVM).
    * All core java fundamental classes are part of rt.jar file.
    * Required to develop and execute Java applications.

## Hello World - Variations
* In STS Eclipse, classes are written under "src" directory. They are auto-compiled and generated .class files are placed under "bin" directory.
* One Java project can have multiple .java files. Each file can have main() method which can be executed separately.
* The main() method must be public static void. Missing any of them raise compiler error.
* The entry-point method must be main(String[] args). Otherwise, raise runtime error - main() method not found.
* The main() method can be overloaded i.e. method with same name but different parameters (in same class).
* If a .java file contains multiple classes, for each class a separate .class file is created.
* Name of (non-public) Java class may be different than the file name. The name of generated .class file is same as class name.
* Name of public class in Java file must be same as file-name. One Java file can have only one public class.

## Assignments
1. Write a program to calculate area and circumference of Circle. Radius should be initialized with fixed value. Use any editor to type the code and compile on command line.
2. Write a program to calculate area and perimeter of Square. Side should be initialized with fixed value. Use Eclipse STS 4.x IDE.

