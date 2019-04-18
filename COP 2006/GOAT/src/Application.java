import java.util.Random;
/*LIST OF JAVA BUILT IN DATA TYPES-
 * BYTE-Minimum value of -128 and maximum value of 127. Useful for saving memory in large arrays, where memory saving actually matters.
 * SHORT-This is 16bit it has a minimum value of -32,768 and a max of 32,767. same guidelines apply as byte, you can use a short to save memory in large array, in situations where memory actually matters!
 * LONG- In Java SE 8 and further you can use the long data type to represent an unsigned  64-bit long, which has a minimum value of 0 and max of 2^64-1. Use when you need larger data types than that of int. 
 * DOUBLE- double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice. Never use for precise values like currency
 * FLOAT - Single precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers. 
 * INT-minimum value of -2^31 and maximum of value of 2^31-1. In Java SE 8 and further you can use the int data type to represent unasigneed 32-bit integer, which has a minimum value of 0 and max value of 2^32-1.
 * CHAR-  Minimum value of '\u0000'(or0) and a maximum value of '\uffff' (or 65,535 inclusive)
 * STRING- String objects are immutable, meaning once created, the value cannot be changed!
The String class is not a primitive data type
 * BOOLEAN- Typically used as a true or false statement, represents one bit of info and default value is false 
 */
// Carlos Sanchez
// A program integrating skills learned in COP 2006
// Variable is a location in memory
// Scope means a variable is only accessible in the method it was declared.
import java.util.Scanner;

// A constructor is a method that doesn't have a return type, name is always same as class name.
public class Application {
//this is a header, top line of a method, Identified a header

 // method call is using an object we can call a method from another class, identified method call

 // public is an access modifier

 // void is the return type, means method shouldn't return method names

 // Operator precedence evaluates and resolves several operators in an order.

 // Created a method with arguments and return values

 // parameters, variables passed, identified: side1 and side2, needs to be multiplied.
 // used * sign

 // Arguments are the actual values that are passed in when method is invoked. Argument Identified

   // Java program to demonstrate working of method 
   // overloading in Java. 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("This is my integration project.");
    System.out.println("A collection of excercises I've used through this semester.");

    // Used a Math class
    //We can use the Math class without intializing it, here I'll use the power function to square the number seven
    System.out.println(Math.pow(7, 2));

    // if else
    // Compare two springs with == sign.
    // The == checks if both objects point to the same memory location.
    String s1 = "String1";
    String s2 = "String2";
    if (s1 == s2) {

      System.out.println("String 1 is equal to string 2");
    } else if (s1.equals(s2)) {
      System.out.println("String 1 are still equal to string 2");
    }
    // compareTo with two objects
    System.out.println(s1.compareTo(s2));


    int grade = 90;

    char finalLetter = (grade >= 90) ? 'A' : 'B';
    // ? is ternary operator
    // variable x = (expression) ? value if true: value if false
    if (grade >= 90) {
      finalLetter = 'A';
    } else if (grade >= 80) {
      finalLetter = 'B';
    } else if (grade >= 70) {
      finalLetter = 'C';
    } else if (grade >= 60) {
      finalLetter = 'D';
    } else {
      finalLetter = 'F';
    }

    // Use conditional Operators &&, ||
    // used == sign
    // The == works with objects because it is used to compare two operands to see if the two are equal.
    int years = 5;
    int days = 7;
    if ((years == 5) && (days == 7))
      System.out.println("My favorite numbers are 5 and 7!");
    if ((years == 5) || (days == 8))
      System.out.println("My favorite number may be five or eight");

    // Used switch
    // Used break in a loop
    // break is used when the loop is ended and then it resumes the next statement following the
    // loop

    Scanner input = new Scanner(System.in);
    System.out.println("please enter a 'start' or 'stop':  ");
    String text = input.nextLine();

    switch (text) {
      case "start":
        System.out.println("Machine started!");
        break;

      case "stop":
        System.out.println("Machine stopped. ");
        break;

      default:
        System.out.println("Command not recognized");
    }
    // Used continue in a loop
    // continue means that it'll skip to the next iteration of the loop.
    
    int[] numbers = {1, 2, 3, 4, 5};

    for (int x : numbers) {
      if (x == 3) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }

    int thisNumber = 2;
    System.out.println(--thisNumber);
    // Output will be 1

    // Rolling a dice six times to get six random numbers,
    // assignment "Random"
    // used random class
    // used ++ sign
    // Used While loops
    // Used for loops
    int num = 0;
    int numberOfTimesRandomNumberPickedAndPrinted = 0;

    Random randomGen = new Random();

    while (numberOfTimesRandomNumberPickedAndPrinted < 5) {
      System.out.println(randomGen.nextInt(53));
      numberOfTimesRandomNumberPickedAndPrinted++;
    }

    for (int numberOfTimes = 0; numberOfTimes < 5; numberOfTimes++) {
      System.out.println(randomGen.nextInt(53));
      numberOfTimesRandomNumberPickedAndPrinted++;
    }

    int number;
    for (int counter = 1; counter <= 6; counter++) {
      number = 1 + randomGen.nextInt(6);
      System.out.println(1 + randomGen.nextInt(6));

    }

    // Used do while loops
    int counter1 = 0;

    do {
      System.out.println(counter1);
      counter1++;
    } while (counter1 <= 17);
    
    // Used % sign
    
    int women, men, people1;
    women = 11;
    men = 3;
    people1 = women % men;
    System.out.println(people1);
    // Output is 2

    // Used of basic operators "+" and "+="
    System.out.println("22"+2);
    // Output is 222

    double number6 = 6;
    number6 += 7;
    System.out.println(number6);
    // Output will be 13

    boolean whenAcurrate = true;
    boolean notAcurrate = false;
    int howFast = 40;
    double doubleSpeed = 2.0;
    String Car1 = "Mazda";

    System.out.println(whenAcurrate);

    System.out.println(notAcurrate);

    System.out.println(Car1
        + " going 40 mph, if the speed doubles in one minute how fast is it going?");  

    final double valuePi = Math.PI;
    // When a variable is declared with final keyword, its value can’t be modified, so for Pi it's
    // always 3.14

    Object anObject = "I'm going to type this casting";
    String aString = (String) anObject;
    // Casting is taking an Object of one particular type and “turning it into” another Object type.

    System.out.println("Top  \"Middle\" " + "bottom " + Car1);
    
    //Polymorphism 
    Plant vegetable = new Plant();
    Spinach spinachfood = new Spinach();
    
    Plant vegetable2 = spinachfood;
    
    vegetable2.grow(); 
    spinachfood.superfood();
    doGrow(vegetable);
  }
    public static void doGrow(Plant plant) {
      plant.grow();
    }
  
  
}
