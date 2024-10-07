Java Overview 
<br>
What is Java: <br>
A high-level, object-oriented programming language designed to have as few implementation dependencies as possible. It is widely used for building web applications, mobile apps, and enterprise software.
<br>
Key Features:
Platform Independence: Write once, run anywhere (WORA) via Java Virtual Machine (JVM).
<br>
Object-Oriented: Supports classes, objects, inheritance, encapsulation, and polymorphism.
<br>
Automatic Memory Management: Garbage collection handles memory management.
<br>
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
<br>

Single-line comment: // This is a comment
<br>
Multi-line comment: /* This is a comment */
<br>
3. Data Types
<br>

Primitive Data Types:
<br>

int: Integer type (e.g., int a = 10;) <br>
double: Floating-point type (e.g., double b = 5.5;) <br>
char: Character type (e.g., char c = 'A';) <br>
boolean: True or false (e.g., boolean flag = true;) <br>
Non-Primitive Data Types:
<br>
```ruby
Strings: String name = "John";
Arrays: int[] numbers = {1, 2, 3};
```
Classes and Objects. <br>
4. Control Structures <br>
Conditional Statements: <br>  

if statement: <br>
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
Loops: <br>

for loop: <br>

```ruby
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

```
while loop: <br>
```ruby
while (condition) {
    // code
}
```
do-while loop:
```ruby
do {
    // code
} while (condition);
```
5. Object-Oriented Programming<br>
Classes and Objects:<br>

```ruby
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
```
6. Exception Handling <br>
Try-Catch Block: <br>
```ruby
try {
    // code that may throw an exception
} catch (ExceptionType e) {
    // handling exception
} finally {
    // code that runs regardless of exception
}
```
7. Collections Framework <br>
Common Collections: <br>

ArrayList: Dynamic array. <br>
HashMap: Key-value pairs. <br>
HashSet: Unique elements.<br>
```ruby
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

```
8. Basic Input/Output <br>
Using Scanner for Input: <br>
```ruby
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
```
9. Key Java Terminology <br>
JDK (Java Development Kit): A software development kit for developing Java applications. <br>
JRE (Java Runtime Environment): Provides libraries and JVM necessary to run Java applications. <br>
JVM (Java Virtual Machine): An engine that enables Java bytecode to run on any platform. <br>
