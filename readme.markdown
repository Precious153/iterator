# Java class note

**Primitives Type**

*Primitive data types store simple values directly in memory (not objects)*
- *byte(-128 to 127)*
- *short(-32,768 to 32768)*
- *int(±2,147,483,647)*
- *long(6-7dp)*
- *boolean(true or false)*
- *char(0 to 65,535)*
- *float*
- *double*

```
public class Main{
   public static void main (String [] ags){
   byte temperature = -10;
   short students = 1000;
   int age = 10;
   long worldPopulation = 7800000000L;
   boolean isJavaFun = true;
   char grade ='A';
   float pi = 3.14f;
   double pi = 3.141592653589793;
   } 
}
```
**Reference Type**

*Reference types stores memory addresses (refs) to objects*
- *String*
- *Array*
- *Classes*
- *Interfaces*

**Wrapper Type**

*wrapper classes allow primitive data types to be represented as objects.*

- *Byte*
- *Short*
- *Integer*
- *Long*
- *Float*
- *Double*
- *Character*
- *Boolean*

```
class WrapperClassesExamples {
    public static void main(String[] args) {

        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6f;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; 

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped values:");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);
    }
}
```

### ARRAYS AND COLLECTIONS
Arrays are for fixed-size and same-type elements
Collections are dynamic data structures from java.util
Collections Common types:
- List -> ArrayList
- Set -> HashSet (doesn't allow duplicates)
- Map -> HashMap
# Array Example
int[] numbers = {1,2,3,4,5};
System.out.println(numbers[0]);
# Collections Example
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");

CONTROL FLOW STATEMENTS
## Example
# If-Else
if (age >= 18) {
System.out.println("Adult");
} else {
System.out.println("Minor");
}
# Ternary Operator Example
String result = (age >= 18) ? "Adult" : "Minor";
# Switch
int day = 2;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Unknown");
}

### OOP: CLASSES AND OBJECTS

Classes are blueprint of an object
Objects are instance of a class
# Class Example
class Person {
String name;
int age;
}
# Object Example
Person p = new Person;
p.name = "James"
p.age = 24;

### METHOD OVERLOADING
Same method name, different parameters
# Examples
class MathUtils{
int add(int a, int b) {
return a + b;
}

    double add(double a, double b) {
        return a + b;
    }
}

### SUPERCLASS
A class that is inherited by another class
```
class Animal {
void sound() {
System.out.println("Animal Sound");
}
}
class Dog extends Animal {
}
```
### this KEYWORD
Refers to the current object
```
class Person {
String name;

    Person(String name) {
        this.name = name
    }
}
```
### SCANNER
Used to read user inputs
# Example
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter name");
String name = scanner.nextLine();

### LOOPS
## For Loop
for(int i = 0; i<5; 1++) {
System.out.println(i);
}
## While Loop
int i = 0;
while (i<5) {
i++
}
## Do-While Loop
do {
System.out.println("Runs at least once")
} while (false);

### INTERFACES
## Definition
A contract that a class must implement. It means the implementation of the method will be found in another class
# Example
interface Payment {
void pay() { // method name must be lowercase
System.out.println("Pay with Card");
}
}
class CardPayment implements Payment {
public void pay() {
System.out.println("Pay with Card");
}
}

 ### ERROR AND EXCEPTION HANDLING (Try-Catch)
Handles runtime errors gracefully. Handle errors in the catch block
Types:
- Runtime
- Compile time
   
try {
int result = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero);
} finally {
System.out.println("Done")
}

### GENERICS
Allows for type safety in classes and methods

List<String> names = new ArrayList<String>();
names.add("Grace");
/ names.add(10); will throw compile-time error

```
class Box<T> {
T value;

    void set(T value) {
        this.value = value
    }

    T get() {
        return value
    }
}
Box<String> stringBox = new Box<>();
stringBox.set("Hello");
System.out.println("Value: " + stringBox.get());

Box<Integer> intBox = new Box<>();
intBox.set(50);
System.out.println("Value: " + stringBox.get());

```