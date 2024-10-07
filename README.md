Java Overview
What is Java: <br>
A high-level, object-oriented programming language designed to have as few implementation dependencies as possible. It is widely used for building web applications, mobile apps, and enterprise software.
Key Features:
Platform Independence: Write once, run anywhere (WORA) via Java Virtual Machine (JVM).
Object-Oriented: Supports classes, objects, inheritance, encapsulation, and polymorphism.
Automatic Memory Management: Garbage collection handles memory management.
2. Basic Syntax

Hello World Example:
```ruby

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Comments:

Single-line comment: // This is a comment
Multi-line comment: /* This is a comment */
<br>
3. Data Types
Primitive Data Types:

int: Integer type (e.g., int a = 10;)
double: Floating-point type (e.g., double b = 5.5;)
char: Character type (e.g., char c = 'A';)
boolean: True or false (e.g., boolean flag = true;)
Non-Primitive Data Types:
```ruby
Strings: String name = "John";
Arrays: int[] numbers = {1, 2, 3};
```
Classes and Objects.
4. Control Structures
Conditional Statements:

if statement:
```ruby
if (condition) {
    // code to execute if condition is true
}
switch statement:
java
Copy code
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

```
Loops:

for loop:

```ruby
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

```
while loop:
java
Copy code
while (condition) {
    // code
}
do-while loop:
java
Copy code
do {
    // code
} while (condition);
5. Object-Oriented Programming
Classes and Objects:

java
Copy code
class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.bark();
    }
}
Inheritance:

java
Copy code
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}
6. Exception Handling
Try-Catch Block:
java
Copy code
try {
    // code that may throw an exception
} catch (ExceptionType e) {
    // handling exception
} finally {
    // code that runs regardless of exception
}
7. Collections Framework
Common Collections:

ArrayList: Dynamic array.
HashMap: Key-value pairs.
HashSet: Unique elements.
java
Copy code
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
8. Basic Input/Output
Using Scanner for Input:
java
Copy code
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
9. Key Java Terminology
JDK (Java Development Kit): A software development kit for developing Java applications.
JRE (Java Runtime Environment): Provides libraries and JVM necessary to run Java applications.
JVM (Java Virtual Machine): An engine that enables Java bytecode to run on any platform.
Conclusion
These notes provide a basic overview of Java programming concepts and syntax. As you continue learning, consider exploring more advanced topics like multithreading, networking, and Java frameworks (e.g., Spring). Happy coding!
